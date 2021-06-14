import java.util.Scanner;//像python那樣加載模組

public class T16_input_updata{
    public static void main(String[]args){
        Scanner user = new Scanner(System.in);//創建一個Scanner對像
        System.out.print("name:");//提示輸入
        var name = user.nextLine();//讀取剛才輸入那行字符,str對應line
        System.out.print("year:");
        var age = user.nextInt();//讀取剛才輸入的數字,數字類型對應int
        System.out.printf("you:%s , age:%d",name,age);//格式化輸出
    }
}