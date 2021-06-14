public class T15_output{
    public static void main(String[]args ){
        System.out.print("Hello ");//沒有ln則不會換行
        System.out.println("Hello");
        String test = "Hello world\n";
        System.out.printf(test);//java也有提供格式化輸出,和C一樣,要利用printf來進行格式化
        double num = 3.1415926;
        System.out.printf("%.2f",num);//和python一樣,支援用格式化符號  
    }
}