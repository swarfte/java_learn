/*
 * @Author: Swarfte_Tou
 * @Date: 2021-02-16 23:35:41
 * @LastEditors: Swarfte_Tou
 * @LastEditTime: 2021-02-17 14:41:21
 * @FilePath: \1A\JAVA\T7_int_calc.java
 * @FileOutput: pyinstaller -F -w file_name.py -p C:/python/lib/site-packages 
 * @GUImode: designer
 * @UItoPY: pyuic5 -x name.ui -o name.py 
 */
public class T7_int_calc {
    public static void main (String []args){
        int i = (100 + 200) * (99 - 88); // 3300
        System.out.println(i);
        int x = 12345 / 67; // 184
        System.out.println(x);
        int y = 12345 % 67;
        System.out.println(y);
        int n = 3300;
        n++; //* 3301, 相当于 n = n + 1;
        System.out.println(n);
        int G = 7;       //* 00000000 00000000 00000000 00000111 = 7 移位運算
        int G_1 = G << 1; // 00000000 00000000 00000000 00001110 = 14
        System.out.println(G_1);
        int G_2 = G_1 << 1;  // 00000000 00000000 00000000 00011100 = 28
        System.out.println(G_2);
        int G_3 = G_2 >> 1;
        System.out.println(G_3); //00000000 00000000 00000000 00111000 = 14
        //左移 == 原數字*2 右移== 原數字/2
        int m_1 = -1;
        int m_2 = m_1 >>> 1;//*无符号的右移运算,它的特点是不管符号位，右移后高位总是补0，因此，对一个负数进行>>>右移，它会变成正数，原因是最高位的1变成了0
        System.out.println(m_2);
        int t_1 =  0 & 0;//*与运算的规则是，必须两个数同时为1，结果才为1：
        System.out.println(t_1);//位运算,
        int t_2 = 0 & 1; // 0
        System.out.println(t_2);
        int t_3 = 1 &1 ; // 1
        System.out.println(t_3);
        int o_1 = 0 | 0 ; // 或运算的规则是，只要任意一个为1，结果就为1：
        System.out.println(o_1);
        int o_2 = 1 | 0; // 1
        System.out.println(o_2);
        int o_3 = 1 | 1; // 1
        System.out.println(o_3);
        //!以下部份有待驗證
        // int j_1 = ~0 ; //非运算的规则是，0和1互换：
        // System.out.println(j_1);
        // int j_2 = ~3 ;
        // System.out.println(j_2);
        int l_1 = 0 ^ 0;//异或运算的规则是，如果两个数不同，结果为1，否则为0：
        System.out.println(l_1);
        int l_2 = 0 ^ 1;
        System.out.println(l_2);
        int l_3 = 1 ^ 1;
        System.out.println(l_3);
    }
}
