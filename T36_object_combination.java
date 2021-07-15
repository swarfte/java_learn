public class T36_object_combination{
    public static void main(String[] args){

    }
}

class Book{
    protected String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Student{
    protected String name;
    protected Book book;//即Student可以持有一个Book实例

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //因此，继承是is关系，组合是has关系。
}