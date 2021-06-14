/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-17 14:55:37
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-17 15:02:26
 * @FilePath: \1A\JAVA\T10_equation.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T10_equation {
    public static void main (String []args){
        int a = 1; 
        int b = 3;
        int c = -4;
        double DT_check = b * b - 4 * a *c;
        double DT = Math.sqrt(DT_check);
        double ans_1 = (-1 * b + DT) / (2 * a);
        double ans_2 = (-1 * b - DT) / (2*a);
        System.out.println(ans_1);
        System.out.println(ans_2);
    }
    
}

