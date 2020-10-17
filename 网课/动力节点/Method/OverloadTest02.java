/*
* 使用方法重载机制，解决方法类似但类型的
*           不同而要调用或者定义不同类型同一方法的机制
*       优点：1.代码整齐美观
*            2.功能相似的，可以让方法名相同，更有利于后面的编写
* */
public class OverloadTest02 {
    //主方法
    public static void main(String[] args){
        //对于程序员来说便于记忆
        int x= sum(10,199);
        System.out.println(x);
        double s= sum(100.3,3.33);//自动类型转换
        System.out.println(s);
        //重载条件： 同一个类 方法名相同 形参不同
        m1();
        m1(2);
        m1(2.2);
    }
    public static void m1(){
        System.out.println("m1无参数执行");
    }
    public static void m1(int a){
        System.out.println("m1有参数执行");
    }
    public static void m1(double a){
        System.out.println("m1有duoble类型参数执行");
    }
    public static int sum(int a ,int b ){
        return a+b;
    }
    //定义一个long类型数据求和方法
    public static long sum(long a , long b ){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
}
