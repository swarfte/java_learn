public class T47_TypeOfPackaging {
    public static void main (String[] args){
        //基本类型：byte，short，int，long，boolean，float，double，char
        //引用类型：所有class和interface类型
        //引用类型可以赋值为null，表示空，但基本类型不能赋值为null
        Inter test1 = null;
        Inter test2 = new Inter(94);
        int num1 = test2.getValue();//int 和 inter相互轉換(類型一樣)
        System.out.println(num1);

        //因为int和Integer可以互相转换
        int x = 50;
        Integer y = Integer.valueOf(x);//这种直接把int变为Integer的赋值写法，称为自动装箱（Auto Boxing）
        int z = y.intValue();//反过来，把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing）。
        System.out.println(z);//装箱和拆箱会影响代码的执行效率，因为编译后的class代码是严格区分基本类型和引用类型的
        String i = "123";
        int j = Integer.parseInt(i);//把str轉為int
        System.out.println(j);
    }
}

class Inter {//為了使int能賦值null而創出來,
    private int value;

    public Inter(int num){//重載初始化的方法,必須傳入參數
        this.value = num;
    }

    public int getValue() {
        return this.value;
    }
}
