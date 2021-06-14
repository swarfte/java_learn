/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-17 17:30:05
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-17 17:33:49
 * @FilePath: \1A\JAVA\T14_Array.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
//数组是同一数据类型的集合，数组一旦创建后，大小就不可变；
public class T14_Array {
    public static void main(String[] args){
        int[] num =  new int[5];//數值用new來創作
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        System.out.println(num[0]);
        int num_long = num.length;//用length求出數組長度
        System.out.println(num_long);
        int[] num_2 = {5,4,3,2,1};
        System.out.println(num_2[1]);//另一種寫法
        String[] str = {
            "ben","jojo","ABC"
        };
        System.out.println(str[0]);//和python差不多的寫法
    }
    
}