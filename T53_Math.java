public class T53_Math{
    public static void main(String[] args){
        int num1 = -5;
        System.out.println(Math.abs(num1));//輸出絕對值
        int num2 = 7;
        System.out.println(Math.max(num2, num1));//求最大值
        System.out.println(Math.min(num2,num1));//求最少值
        System.out.println(Math.pow(10,2));//求10的2次方
        System.out.println(Math.sqrt(64));//求64的平方
        System.out.println(Math.exp(3));//求e的3次方
        System.out.println(Math.log(4));//计算以e为底的对数
        System.out.println(Math.log10(1000));//以10為底的對數
        System.out.println(Math.sin(3.14));
        System.out.println(Math.cos(3.14));
        System.out.println(Math.tan(3.14));
        System.out.println(Math.asin(1.0));
        System.out.println(Math.acos(1.0));
        double pi = Math.PI;
        System.out.println(pi);//輸出派的值
        double e = Math.E;
        System.out.println(e);//輸出E的值
        System.out.println(Math.random());//生成0 <= x < 1
        

    }
}