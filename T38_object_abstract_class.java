public class T38_object_abstract_class{
    public static void main(String[] args){
    // Student S1 = new Student();
    // S1.run();
    //引用抽象类的好处在于，我们对其进行方法调用，并不关心Person类型变量的具体子类型
    Person T1 = new Teacher();//就像person類可以直接引用teacher或student
    Person S1 = new Student();
    T1.run();
    S1.run();
    }
}

//如果一个class定义了方法，但没有具体执行代码，这个方法就是抽象方法，抽象方法用abstract修饰
abstract class Person{//因为无法执行抽象方法，因此这个类也必须申明为抽象类（abstract class）。
    public abstract void run();//abstract用作表示抽像類,表示它是一个抽象方法，本身没有实现任何方法语句
}//抽象类可以强迫子类实现其定义的抽象方法，否则编译会报错。因此，抽象方法实际上相当于定义了“规范

class Student extends Person{
    @Override
    public void run(){//必須覆寫run方法才合法
        System.out.println("hello sir");
    }
}

class Teacher extends Person{
    @Override
    public void run(){
        System.out.println("hello everyone");
    }
}
