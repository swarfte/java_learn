import java.util.StringJoiner;

public class T46_StringJoiner{
    public static void main(String[] args){
        //利用StringBuild完成拼接字符串
        String[] names = {"ben", "jojo", "yoyo"};
        
        var sentence1 = new StringBuilder();//要高效拼接字符串，应该使用StringBuilder
        for (String x : names){
            sentence1.append(x).append(",");//連接名字和逗號
        }
        int sen_len = sentence1.length();//獲長字符串的長度
        sentence1.delete(sen_len - 1 , sen_len);//刪後最後一個索引值的位置(",")
        System.out.println(sentence1.toString());

        //利用StringJoiner完成拼接字符串
        var sentence2 = new StringJoiner(",");//以逗號分隔
        for (String x : names){
            sentence2.add(x);//把names數組中的元素逐一連接
        }
        System.out.println(sentence2);
        
        //利用String的join方法
        var sentence3 = String.join(",",names);
        System.out.println(sentence3);

        //3種方式結果是一樣的
    }
}