import java.util.Arrays;
public class T26_Two_dimensional{
    public static void main(String[]args){
        int[][] num={
            {1,3,5,7,9},
            {11,13,15,17,19},
            {21,23,25,27,29}
        };
    System.out.println(num.length);//這個二維陣列的長度是3
    System.out.println(num[0].length);//二維陣列內其中一維的長度是5
    int[] test = num[0];//獲得第一個數組的資料
    System.out.println(Arrays.toString(test));
    //用內置的方法打印數組
    for (int[] x:num){//冒號前為臨時變量,後面則是二維數組
        for (int y :x){
            System.out.print(y);
            System.out.print(",");
            }
        System.out.println();//每個數組都換行
        }
    //使用Java标准库的Arrays.deepToString()
    System.out.println(Arrays.deepToString(num));//deepToString用作多維陣列
    }
}