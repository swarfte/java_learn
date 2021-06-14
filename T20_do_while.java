public class T20_do_while{
    public static void main(String[]args){
        int number = 0;
        int x = 1;
        do{//do while循环会至少循环一次。
            number += x;
            x++;
        }while(x <= 100);
        System.out.println(number);
    }
}