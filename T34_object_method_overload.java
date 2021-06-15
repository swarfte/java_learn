public class T34_object_method_overload{
    public static void main(String[] args){
        Hello t1 = new Hello();
        t1.hello();
        Hello t2 = new Hello();
        t2.hello("ben");
        Hello t3 = new Hello();
        t3.hello("jojo",17);
        String s = "Test string";
        int n1 = s.indexOf('t');//int indexOf(String str)：根据字符串查找,由0開始數起
        int n2 = s.indexOf("st");//int indexOf(String str)：根据字符串查找
        int n3 = s.indexOf("st", 4);//int indexOf(String str, int fromIndex)根据字符串查找，但指定起始位置。
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Hello{
    public void hello(){//預設的
        System.out.println("hello world");
    }

    public void hello(String name){//重載方法
        System.out.println("hello " + name);
    }

    public void hello(String name , int age){//遇到不同的參數時會自動選擇合適的
        if (age >= 18){
            System.out.println("well come " + name);
        }else{
            System.out.println("what are you doing " + name);   
        }
    }
}