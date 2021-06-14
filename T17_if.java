public class T17_if{
    public static void main(String[] args){
        int num = 25;
        if (num>20){
            System.out.println("ok");
        }else{//else用作不符合條件時的行動
            System.out.println("not OK");
        }
        System.out.println("end");
        String str1 = "hi";
        String str2 = "HI".toLowerCase();//把"HI"變作小寫,和python一樣
        if (str1 == str2){//判斷兩個變量的引用类型是否相等(str2是經由方法才變為hi,所以不一樣)
            System.out.println("s1==s2");
        }else{
            System.out.println("s1!=s2");
        }
        if (str1.equals(str2)){//判斷兩個變量的值是否相等
            System.out.println("s1 is s2");
        }else{
            System.out.println("s1 is not s2");
        }
    }
}