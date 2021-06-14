/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-16 15:11:20
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-16 18:01:07
 * @FilePath: \1A\JAVA\T2_inputjava
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T2_output_easy {//Java程序的入口方法，JVM在运行程序时，会先查找main. public是权限修饰符，表明任何类或对象都可以访问这个方法
    public static void main(String []args){
        int x = 100;
        System.out.println("x ="  + x);
        x += 100;
        System.out.println("x = " + x);
    }
}
