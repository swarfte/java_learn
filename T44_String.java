public class T44_String {
    public static void main(String[] args){
        String test1 = new String(new char[] {//字符串在String内部是通过一个char[]数组表示的，因此，按下面的写法也是可以的
            'H', 'e', 'l', 'l', 'o', '?'//必須使用單引號
        });
        System.out.println(test1);
        String say = "Hello";
        String check = "lo";
        System.out.println(say.contains(check));// 檢測是否包含子串"ll:
        System.out.println(say.indexOf(check));//返回第一次出现的指定子字符串在此字符串中的索引。(由左開始)
        System.out.println(say.lastIndexOf(check));//返回第一次出现的指定子字符串在此字符串中的索引。(由右開始)
        System.out.println(say.startsWith(check));//檢測該字串是否在開頭
        System.out.println(say.endsWith(check));//檢測該字串是否在結尾
        String test2 = say.substring(2);//由索引值2號開始獲取至最後的字符串
        String test3 = say.substring(2,4);//獲取索引值2~4號的字符內容,獲取2號的內容,但不獲取4號的內容
        System.out.printf("test2 : %s , test3: %s \n",test2,test3);
        String temp1 = "benjamin";
        String temp2 = temp1.replace("b","B");
        System.out.println(temp2);//所有字符'b'被替换为'B'
        String temp3 = temp1.replace("jamin","chau");//所有字符'jamin'被替换为'chau'
        System.out.println(temp3);
        String[] array1 = {"A","B","C"};
        String connect = String.join("+",array1);//利用join的方法,用指定的字符串连接字符串数组
        System.out.println(connect);
        String array2 = "S,w,a,r,f,t,e";
        String[] cut = array2.split("\\,");//要分割字符串，使用split()方法，并且传入的也是正则表达式
        System.out.println(cut);
        String new_string1  = "\tHello\r\n ".trim();//使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n
        System.out.println(new_string1);//trim()并没有改变字符串的内容，而是返回了一个新字符串。
        String new_string2 = "\u3000Hello\u3000".strip();//strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除
        System.out.println(new_string2);
        String new_string3 = " Hello ".stripLeading();//stripLeading()會保留前面的空白字符
        System.out.println(new_string3);
        String new_string4 = " Hello ".stripTrailing();//stripTrailing()則會保留後面的空白字符
        System.out.println(new_string4);
        System.out.println("".isEmpty());//字符串長度為0,即為空白,true,根據長度來判定
        System.out.println(" ".isEmpty());//長度不為0則false
        System.out.println("  \n".isBlank());//为只包含空白字符,所以是true
        System.out.println(" Hello ".isBlank());//因为包含非空白字符,所以是false
        String temp4 = "%s what are you doing in %d age";//%s和%d可以傳入參數
        //如果你不确定用啥占位符，那就始终用%s，因为%s可以显示任何数据类型
        System.out.println(temp4.formatted("ben",18));//formatted()方法只需按順序傳入對應參數
        System.out.println(String.format(temp4,"yoyo",19));//format是屬於String的方法,需傳入要格式化的字串和參數
        System.out.println(String.valueOf(123));//把int轉為str輸出
        System.out.println(String.valueOf(45.67));//把float轉為str輸出,valueOF會根據輸入的類型重載
        System.out.println(String.valueOf(true));//把boolean轉為str輸出
        int num1 = Integer.parseInt("123");//把"123"轉為123
        System.out.println(((Object)num1).getClass().getSimpleName());//得出類型是int
        int num2 = Integer.parseInt("ff", 16); // 按十六进制转换
        System.out.println(num2);//輸出255
        System.out.println(((Object)num2).getClass().getSimpleName());//一樣是int
        boolean bool1 = Boolean.parseBoolean("TRUE");//把"true"轉換為bool類型
        System.out.println(bool1);//大寫會強制變為小寫
        System.out.println(((Object)bool1).getClass().getSimpleName());//輸出為bool類型
        boolean bool2 = Boolean.parseBoolean("ABC");
        System.out.println(bool2);//不是true的都為false
        char[] char1 = "hello".toCharArray();//把Str類型轉換為char類型
        System.out.println(char1);
        String str1 = new String(char1);//把char[] 轉為Str
        System.out.println(str1);
        byte[] byte1 = "hello".getBytes();//按系统默认编码转换，不推荐
        System.out.println(byte1);
        // byte[] byte2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        // System.out.println(byte2);
        // byte[] byte3 = "Hello".getBytes("GBK"); // 按GBK编码转换
        // System.out.println(byte3);
        // byte[] byte4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
        // System.out.println(byte4);
    }
}