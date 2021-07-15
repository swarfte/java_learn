public class T39_object_interface{
    public static void main(String[] args){
    Student S1 = new Student("Unknown");
    S1.run();
    List L1 = new ArrayList();//List接口引用具体子类的实例,list是ArrayList的父類
    }
}

abstract class Person{//如果一个抽象类没有字段，所有方法全部都是抽象方法
    public abstract void run();
    public abstract String getName();
}

//就可以把该抽象类改写为接口：interface。
interface People{//所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的
    void run();
    String getName();
}

interface Hello{
    void say();
    String back();
}

class Student implements People{//当一个具体的class去实现一个interface时，需要使用implements关键字
    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(this.name + "run");
    }

    @Override
    public String getName(){
        return this.name;
    }
}

class teacher implements People,Hello{//在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface
    @Override
    public void run(){
        System.out.println("run");
    }

    @Override
    public String getName(){
        return "name";
    }
    @Override
    public void say(){
        System.out.println("say");
    }

    @Override
    public String back(){
        return "back";
    }
}

interface Family extends Person{//一個接口也能夠繼承能一個接口
    void number();
}

interface Children {
    void age();
    default void id();//default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
}

class friends(){
    public void know(){
        System.out.println("hi");
    }
}