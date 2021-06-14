public class T21_for{
    public static void main(String[]args){
        int number = 0;
        for (int x = 1 ; x <=100 ; x++){//for循環和C語言一樣
            number +=x;
        }
        System.out.println(number);
        int[] num_list = {1,3,5,7,9};
        for (int x = 0 ; x < num_list.length; x++){
            System.out.println(num_list[x]);
        }
        for (int x : num_list){//這是for each的寫法,直接把數組內的變量傳入n
            System.out.println(x);
        }
    }
}