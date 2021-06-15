import java.util.Arrays;//更方便的打印數組   的值
public class T24_array_print{
    public static void main(String[]args){
        int[] num = {1,3,5,7,9};
        System.out.println(Arrays.toString(num));//像python列表那樣打印出來
        for (var x = num.length -1 ; x >= 0 ;x--){//倒序輸出
            System.out.println(num[x]);
        }
    }
}