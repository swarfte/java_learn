/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-17 14:47:25
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-17 14:53:14
 * @FilePath: \1A\JAVA\T9_float_calc.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T9_float_calc {
    public static void main(String[] args){
        // 浮点数运算误差
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);
        //如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
        double d1 = 0.0 / 0; // NaN
        System.out.println(d1);
        double d2 = 1.0 / 0; // Infinity
        System.out.println(d2);
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d3);
    }
}
