public class T30_object_method{
    public static void main(String[] args){
        Person china = new Person();//實例化一個物件,物件名為ben
        china.setName("ben");
        china.setAge(20);//設置了這個參數,才能調用getBirth()這個內部方法
        System.out.println("Name:" + china.getName() + " age:" + china.getAge() + " birth:" + china.getBirth());

        Test user = new Test();
    }
}
class Person {
    //*public和private都是field 用作修飾後面的變量
    public String nickname;
    private String name;
    private int age;//private是內在的,外部不能改動

    //*這是要用方法（method）来让外部代码可以间接修改field
    //&以下的方法是公開(public)的,所以外部能夠調用
    public String getName(){//外部獲取數據的方法
        return this.name;//在方法内部，可以使用一个隐含的变量this，它始终指向当前实例
    }

    public void setName(String name){//外部設定數據的方法,所以要傳入參數
        this.name = name;//如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this
    }

    public int getAge(){//外部獲取年齡
        return this.age;//this.name是這個類的name
    }

    public void setAge(int age){//外部設定年齡,int age為方法變量,方法可以包含0个或任意个参数。方法参数用于接收传递给方法的变量值
        if (age < 0 || age > 100){
            throw new IllegalArgumentException("invalid age value");//不滿足就拋出錯誤
        }
        this.age = age;//滿足條件才賦值
    }
    //private只能被內部調用
    private int calcBirth(int year){//用作計算出生日期
        return year - this.age;
    }

    public int getBirth(){
        return calcBirth(2021);//調用內部的方法
    }

}

class Test{
    private String[] names;

    public void setNames(String... names){//可变参数用类型...定义，可变参数相当于数组类型,可填入任意個參數
        this.names = names;
    }

    public void setName(String[] name){//這個寫法和上面一樣,但調用時要先構造string[]
        this.names = name;
    }
}