public class T49_enum {
    public static void main(String[] args){
        Weekday today = Weekday.wed;
        if (today == Weekday.sat || today == Weekday.sun){//根據屬性來調整
            System.out.println("get rest");
        }else{
            System.out.println("do job");
        }
        System.out.println(today.name());//獲取常量的名稱
        System.out.println(today.ordinal());//返回定义的常量的顺序,由0開始數起,wed排在第3位,所以輸出2
        System.out.println(today.toString());//輸出當天的中文名稱
        switch(today){//因为枚举类天生具有类型信息和有限个枚举常量，所以比int、String类型更适合用在switch语句中
            case mon:
            case tue:
            case wed:
                System.out.println("do job now"); 
                break;
            case thu:
            case fri:
            case sat:
            case sun:
            default:
                throw new RuntimeException("cannot process " + today);//加上default语句，可以在漏写某个枚举常量时自动报错，从而及时发现错误
        }

    }
}

//*为了让编译器能自动检查某个值在枚举的集合内，并且，不同用途的枚举需要不同的类型来标记，不能混用，我们可以使用enum来定义枚举类
enum Weekday{//定義關於星期的變量,enum
    mon(1,"星期一"),tue(2,"星期二"),wed(3,"three-day"),thu(4,"星期四"),fri(5,"星期五"),sat(6,"星期六"),sun(7,"星期日");

    public final int dayValue;//不能再變動,可被外部調用
    private final String ChineseName;

    private Weekday(int number,String name){//!重要,這一步讓mon等常量能被賦值,直接賦予初始化後的值  
        this.dayValue = number;
        this.ChineseName = name;
    }

    @Override
    public String toString(){
        return this.ChineseName;
    }
}