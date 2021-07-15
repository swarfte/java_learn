public class T35_object_inherit{
    public static void main(String[] args){
    //向上转型
    Person p = new Student();//因為student類擁有person類全部屬性,所以能夠向上轉型,把student類轉為person類

    Student s = new Student();
    Person pp = s;//把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）。
    Object o1 = pp;//把Person類轉為Object類
    Object o2 = s; //把Student類轉換為Object類

    //向下轉型
    Person p1 = new Student();
    Person p2 = new Person();
    Student s1 = (Student) p1;//向下轉型成功,因為原本P1就是引向Student類的Person類型,這樣只是把類型改成Student,而s1所轉向的和p1一樣是Student類
    //Student s2 = (Student) p2 轉型失敗,因為person並不俱備Student的全部屬性,所以可能向下軓型
    
    

    }
}

class Person{
    
    protected String name = "unknow";//protected修飾的屬性能被子類訪問
    protected int age = 18;//protected关键字可以把字段和方法的访问权限控制在继承树内部，
    private int money = 1000;//private則不能

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

class Student extends Person{//student類繼承person類的屬性和方法,extends用作繼承
    private int score;

    public Student(){
        super();
        this.score = 60;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String sayHello(){
        return "hello" + super.name;//這裡的super是父母的name
    }

    //子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
    public Student(String name , int age , int score){//如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法
        super(name,age);//调用父类的构造方法Person(String name , int age)
        this.score = score;

    }
}