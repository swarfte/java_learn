/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-17 15:03:17
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-17 15:12:40
 * @FilePath: \1A\JAVA\T11_bool_calc.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T11_bool_calc {
    public static void main(String []args ){
        //布尔运算是一种关系运算，包括以下几类：
        //比较运算符：>，>=，<，<=，==，!=
        //与运算 &&
        //或运算 ||
        //非运算 !
        boolean isGreater = 5 > 3; // true
        System.out.println(isGreater);
        int age = 12;
        boolean isZero = age == 0; // false
        System.out.println(isZero);
        boolean isNonZero = !isZero; // true
        System.out.println(isNonZero);
        //短路运算
        boolean a = 5 < 3;
        boolean b = a && (5 / 0 > 0);
        System.out.println(b);//因為短路運算,所以會出現false(只看了第一步(false))
        //三元运算符 //b ? x : y
        //根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果
        int c = -5;
        int ans = c >= 0 ? c : -c;//!判斷C是否大於等於0,如果C>=0,則返回C,不然返回-c (求絕對值)
        System.out.println(ans);//*x和y的类型必须相同

    }
    
}
