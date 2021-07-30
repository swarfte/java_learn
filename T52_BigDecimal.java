import java.math.BigDecimal;//BigDecimal可以表示一个任意大小且精度完全准确的浮点数。
import java.math.RoundingMode;

public class T52_BigDecimal {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("20");
        System.out.println(num1);
        System.out.println(num1.multiply(num1));//用num1乘以num1,即20*20,操作方法和BigInterger
        BigDecimal num2 = new BigDecimal("1234.5678");
        System.out.println(num2.scale());//計算出有幾多個小數位
        BigDecimal num3 = new BigDecimal("123.02000");
        System.out.println(num3.stripTrailingZeros());//去除未尾多餘的小數點
        BigDecimal num4 = new BigDecimal("1200");
        BigDecimal num5 = num4.stripTrailingZeros();
        System.out.println(num5.scale());//因為1200是整除,而最尾的兩個零被去除了
        BigDecimal test1 = new BigDecimal("123.45");
        BigDecimal test2 = new BigDecimal("123.4500");
        System.out.println(test1.equals(test2));//false 因為小數位不同
        System.out.println(test1.equals(test2.stripTrailingZeros()));//true 因為小數位相同
        System.out.println(test1.compareTo(test2));//0 因為數值相同
    }
}
