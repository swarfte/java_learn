public class T40_object_static{
    public static void main(String[] args){
        Person ben = new Person("ben",18);
        Person jojo = new Person("jojo",19);
        ben.number = 30;//實質上來說是Person.number = 30,实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为类名.静态字段来访问静态对象
        System.out.println(jojo.number);//靜態屬性是屬於該類的,當其中一個物件改變靜態屬性時,其他物件也會受到影響
        jojo.number = 80;//事實上和ben.number是同一會事
        System.out.println(ben.number);//
    }
}

class Person{
    public String name;
    public int age;
    public static int number;//改變靜態屬性會一同改變所有已實例化的物件

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value){//用static修饰的方法称为静态方法。
        number = value;//而调用静态方法不需要实例变量，通过类名就可以调用。静态方法类似其它编程语言的函数。
    }//*静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
}

interface Family{
    public static final int Male = 1;//interface是可以有静态字段的，并且静态字段必须为final类型：
    int Female = 2;//因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉
    //&编译器会自动把该字段变为public static final类型。
}

