public class T37_object_polymorphism{//主要的程式
    public static void main(String[] args){//主程式(函式)
    //Person p1 = new Student();//雖然是聲明person物件,但是p1是指向Student類
    //p1.run();
    //p1.Runing(p1);
    Income I1 = new Income();
    //System.out.println("tax:" + I1.getTax());
    Salary S1 = new Salary();
    //System.out.println("tax:"+S1.getTax());//預設是0.2
    Income[] tax_list = {
        new Income(),
        new Salary(),
        new Special()
        };
    System.out.println("tax:" + total(tax_list));
    Student T1 = new Student();
    System.out.println(T1.hello());
    }


    //建立一個類似python的函式(def),並不像class那樣,反而像main那樣
    public static double total(Income[] incomes){//這個函式用作計算總和
        double total = 0;
        for (Income x : incomes){//此時就突出了多態的作用,每個類的getTax()都有不同,因為得到的回傳值也有不同
            total += x.getTax();
        }
        return total;//返回最終結果
    }
}

class Person{
    protected int money;

    public void run(){
        System.out.println("Person.run");//父類指令
    }

    //用final修饰的方法不能被Override,即孕類不能覆寫
    public final void Runing(Person p){//不能確定傳入的person類型所指向的是person類還是Student
        p.run();//多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法
    }

    public String hello (){
        return "hello";//翻回字符串
    }

}

class Student extends Person{//如果方法签名相同，并且返回值也相同，就是覆寫
    @Override//加上@Override可以让编译器帮助检查是否进行了正确的覆写
    public void run(){
        System.out.println("Student.run");
    }

    //在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用
    @Override
    public String hello(){
        return super.hello() + "?";//在原有的hello()返回值上加入?
    }
}

class Income{//檢測稅金
    protected  double money = 15000;//用final修饰的字段在初始化后不能被修改

    public double getTax(){
        return this.money * 0.1;//收10%稅
    }

    public void setMoney(double money){
        this.money = money;
    }
}

class Salary extends Income{//一般人的情況
    protected double check = 10000;
    @Override
    public double getTax(){
        if (money <= this.check){
            return 0;
        }else{
            return (money - this.check) * 0.2;
        }
    }
    public void setCheck(double check){
        this.check = check;
    }
}

class Special extends Income{//特殊的
    @Override
    public double getTax(){
        return 0;//不交稅
    }
}