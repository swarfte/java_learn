public class T22_break{
    public static void main(String[] args){
        var number = 0;
        for (var x = 0 ;; x++){
            number +=x;
            if (x == 100){
                break;//和C語言一樣
            }
        }
        System.out.println(number);
    }
}