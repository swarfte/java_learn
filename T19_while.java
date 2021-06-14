import java.util.Scanner;
public class T19_while{
    public static void main(String[] args){
        int number = 0;
        int n = 1;
        while (n<=100){//和C語言一樣
            number += n;
            n++;
        }
        System.out.println(number);
        Scanner save = new Scanner(System.in);
        System.out.println("start:?");
        int start = save.nextInt();
        System.out.println("end:?");
        int end = save.nextInt();
        int get = 0;
        while (start <= end){
            get += start;
            start++;
        }
        System.out.printf("ans is %d",get);
    }
}