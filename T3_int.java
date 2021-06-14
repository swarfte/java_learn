/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-16 15:19:21
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-16 18:01:27
 * @FilePath: \1A\JAVA\T3_int.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T3_int{
    public static void main(String []args){
        int i = 2147483647;
        System.out.println(i);
        int i2 = -2147483648;
        System.out.println(i2);
        int i3 = 2_000_000_000; // 加下划线更容易识别
        System.out.println(i3);
        int i4 = 0xff0000; // 十六进制表示的16711680
        System.out.println(i4);
        int i5 = 0b1000000000; // 二进制表示的512
        System.out.println(i5);
        long l = 9000000000000000000L; // long型的结尾需要加L   
        System.out.println(l);
    }
}