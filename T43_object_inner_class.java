public class T43_object_inner_class{
    public static void main(String[] args){//main要小寫
        Outside test1 = new Outside(123);
        Outside.Inside test2 = test1.new Inside();//inner_class需要先實例化外層的類,然後才能實例內在的
        //因为Inner Class的作用域在Outer Class内部，所以能访问Outer Class的private字段和方法
        test2.hello();//Inner Class和普通Class相比，除了能引用Outer实例外，还有一个额外的“特权”，就是可以修改Outer Class的private字段
        Outer test3 = new Outer ("Swarfte");
        test3.asyncHello();
        Static_outer.StaticNested test4 = new Static_outer.StaticNested();//因為內部類是靜態的關係,所以能直接實例化
        test4.Hello();
    }
}
class Outside{//outside是普通類
    private int number;

    Outside(int number){
        this.number = number;
    }

    class Inside{//如果一个类定义在另一个类的内部，这个类就是Inner Class
        void hello(){
            System.out.println("number is " + Outside.this.number);
        }
    }
}

class Outer{
    private String name;

    Outer(String name){
        this.name = name;
    }

    void asyncHello(){
        Runnable r = new Runnable() {//Runnable本身是接口，接口是不能实例化的，所以这里实际上是定义了一个实现了Runnable接口的匿名类，并且通过new实例化该匿名类，然后转型为Runnable
            @Override
            public void run(){//runnable 下的方法
                System.out.println("Hello " + Outer.this.name);
            }
        };
        new Thread(r).start();//新增一條線程
    }
}

class Static_outer{
    private static String Name = "YOYO";

    private String age;

    Static_outer(String age){
        this.age = age;
    }
    
    static class StaticNested{//用static修饰的内部类和Inner Class有很大的不同，它不再依附于Outer的实例，而是一个完全独立的类
        //因此无法引用Outer.this，但它可以访问Outer的private静态字段和静态方法
        void Hello(){
            System.out.println("Hello " + Static_outer.Name);
        }
    }
}
