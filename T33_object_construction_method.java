public class T33_object_construction_method{
    public static void main(String[] args){
        Person p1 = new Person("ben chau", 25); // 既可以调用带参数的构造方法
        Person p2 = new Person(); // 也可以调用无参数构造方法
        Person p3 = new Person("jojo");
        System.out.printf("name:%s , age:%d \n",p1.getName(),p1.getAge());
        System.out.printf("name:%s , age:%d \n",p2.getName(),p2.getAge());
        System.out.printf("name:%s , age:%d \n",p3.getName(),p3.getAge());
    }
}

class Person{
    private String name = "unknow";//也能直接初始化
    private int age = 18;

    public Person(){//當我們自定義了構造方法時,那编译器就不再自动创建默认构造方法,因此要手動創建一個預設的
    //没有在构造方法中初始化字段时，引用类型的字段默认是null，数值类型的字段用默认值，int类型默认值是0，布尔类型默认值是false
    }

    public Person(String name,int age){//這是構造方法,沒有返回值也沒有void,和類名相同,這樣在這始化時便能傳入參數
    this.name = name;
    this.age = age;
    }

    public Person(String name){//可以定义多个构造方法，在通过new操作符调用的时候，编译器通过构造方法的参数数量、位置和类型自动区分
        this.name = name;
        this.age = 20;
    }

    public Person(int age){//一个构造方法可以调用其他构造方法，这样做的目的是便于代码复用。调用其他构造方法的语法是this(…)
        this("who");//调用另一个构造方法Person(String name)
    }

    public String getName() {//外部獲取對應的值
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}