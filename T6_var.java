/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-16 21:07:20
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-16 21:12:44
 * @FilePath: \1A\JAVA\T6_var.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T6_var {
    public static void main (String []args){
        var num = 100;//var用作智能判斷變量
        System.out.println(num);
        var A = "a";
        System.out.println(A);
        var ff = 1.123;
        System.out.println(ff);
    }
    
}
