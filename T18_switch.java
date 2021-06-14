import java.util.Scanner;

public class T18_switch{
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);//用作讀取輸入的資料
        System.out.println("input number:1 or 2 or 3");
        int number = save.nextInt();//讀取數字
        switch(number){//switch用作多重選擇,和C語言一樣
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            case 3:
                System.out.println("number is 3");
                break;
            default://当没有匹配到任何case时，执行default
                System.out.printf("your number is %d\n",number);
        }
        System.out.println("testing");
        int test = save.nextInt();
        switch (test){//注:java12版本中不用break也行
        case 1:
        case 2:
        case 3://多種情況混在一起,相當於or
            System.out.println("number is 1 or 2 or 3");
            break;
        default:
            System.out.println("another number");
            break;
        }
    }
}