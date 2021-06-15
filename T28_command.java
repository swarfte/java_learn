public class T28_command{
    public static void main(String[] args){//這個args用作接收命令行參數,類型是字符串組
        for (String x : args){
            if ("-version".equals(x)){//內容相同的時候*(接收到的參數)
                System.out.println("v1.0");
                break;
            }else{
                System.out.println("what are doing");
            }
        }
    }
}