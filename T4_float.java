/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-16 18:01:44
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-16 18:05:33
 * @FilePath: \1A\JAVA\T4_float.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T4_float {
    public static void main(String[] args){
        float f1 = 3.14f;
        System.out.println(f1);
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        System.out.println(f2);
        double d = 1.79e308;
        System.out.println(d);
        double d2 = -1.79e308;
        System.out.println(d2);
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(d3);
    }
}
