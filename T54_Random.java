import java.util.Random;

public class T54_Random {
    public static void main(String[] args){
        Random r1 = new Random();//生成一個隨機物件
        System.out.println(r1.nextInt());//生成一個沒限範圍的隨機整數
        System.out.println(r1.nextInt(10));//生成一个[0,10)之间的int
        System.out.println(r1.nextLong());//生成一個long的int
        System.out.println(r1.nextFloat());//生成一個浮點數
        System.out.println(r1.nextDouble());//生成一個精度更高的浮點數
    }
}
