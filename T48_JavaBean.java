public class T48_JavaBean{
    public static void main(String[] args) {
        
    }
}
class PersonBean{//&种class被称为JavaBean,JavaBean是一种符合命名规范的class，它通过getter和setter来定义属性
    private int age;
    private String name;

    //*對應name字段的寫入和讀取方法
    public String getName() {return this.name;}
    public void setName(String name){this.name = name;}

    //*對應age字段的寫入和讀取方法
    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}
}