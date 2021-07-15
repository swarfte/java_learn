public class T45_StringBuilder{
    public static void main(String[] args){
        String test1 = "";
        for (int x = 0 ; x < 10 ; x++){//在循环中，每次循环都会创建新的字符串对象
            test1 += "," + x;//绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率
        }
        System.out.println(test1);
        StringBuilder sb_test2 = new StringBuilder(1024);//StringBuilder是一个可变对象，可以预分配缓冲区,像現在則是預先分配1024個"空間"
        for (int x = 0 ; x < 10 ; x++){//这样，往StringBuilder中新增字符时，不会创建新的临时对象
            sb_test2.append(",");//和python的list差不多
            sb_test2.append(x);
        }
        String test2 = sb_test2.toString();//最後要把StringBuilder對像的變量轉為String輸出
        System.out.println(test2);//結果和test1一樣
        var sb_test3 = new StringBuilder(1024);//StringBuilder还可以进行链式操作
        sb_test3.append("HI ").append("yoyo ").append("what ").append("are ").append("you ").append("doing ").append("?");//鏈式操作簡單來說即是能不斷在一個方法後面追加方法
        System.out.println(sb_test3.toString());
        calc number = new calc();
        number.add(5).next();//5+1=6
        System.out.println(number.value());
    }
}

class calc{//彷制sb類型的鏈式操作
    private int sum = 0;

    public calc add(int num){//回傳的類型為自身
        sum += num;
        return this;//回傳自身
    }
    public calc next(){
        sum++;
        return this;
    }

    public int value(){
        return sum;
    }

}