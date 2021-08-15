/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-17 17:11:47
 * @LastEditors: Swarfte
 * @LastEditTime: 2021-08-13 15:44:25
 * @FilePath: \JAVA\java_learn\T13_str.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T13_str {
    public static void main(String[] args){
        //因为Java在内存中总是使用Unicode表示字符
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        System.out.println(n1);
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        System.out.println(c3);
        //字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：
        String s = ""; // 空字符串，包含0个字符
        System.out.println(s);
        String s1 = "A"; // 包含一个字符
        System.out.println(s1);
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
        System.out.println(s3);
        // \u0123  表示一个Unicode编码的字符
        //\t 表示Tab
        //Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理。
        String z1 = "hello";
        String z2 = "world";
        System.out.println(z1 + " " + z2);
        //如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串,再連接
        var age = 25;
        String z = "age is " + age;
        System.out.println(z);
        //从Java 13开始，字符串可以用"""..."""表示多行字符串（Text Blocks）了
        String a = """
                  SELECT * FROM
                  users
                  WHERE id > 100
                  ORDER BY name DESC
                  """;
        System.out.println(a);
    }
}
