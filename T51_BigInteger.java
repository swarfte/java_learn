import java.math.BigInteger;
//BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数

public class T51_BigInteger {
    public static void main(String[] args){
        BigInteger num1 = new BigInteger("12345678910");
        System.out.println(num1);
        BigInteger num2 = new BigInteger("10987654321");
        BigInteger sum = num1.add(num2);//对BigInteger做运算的时候，只能使用实例方法
        System.out.println(sum);
        //BigInteger用于表示任意大小的整数；
    }
}
