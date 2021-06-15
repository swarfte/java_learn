import java.util.Arrays;
public class T25_sorted{
    public static void main(String[] args){
        int[] num = {15,68,79,13,48,18,12,46,99,32};
        //利用冒泡排序
        for (int x = 0 ; x < num.length - 1;x++){
            for (int y = 0 ; y < num.length - 1;y++){
                if (num[y] > num[y+1]){
                    int tmp = num[y];//暫存
                    num[y] = num[y+1];//交換
                    num[y+1] = tmp;//交換
                }
            }
        }
        System.out.println(Arrays.toString(num));
        int[] test = {22,44,77,66,33,15,78,65};
        Arrays.sort(test);//利用java內置的快排
        System.out.println(Arrays.toString(test));
    }
}