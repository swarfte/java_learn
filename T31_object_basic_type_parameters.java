public class T31_object_basic_type_parameters{
    public static void main(String[] args){
        Person p = new Person();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值,此時n是整份複制入物件內
        System.out.println(p.getAge()); // 15
        n = 20; // 當外部的n發生改變時,物件內的N沒有變化
        System.out.println(p.getAge()); // 所以輸出15
    }
}
class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
