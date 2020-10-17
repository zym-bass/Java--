/*
        方法重载机制

*/
public class OverloadTest {
    //主方法
    public static void main(String[] args){
        int x  = sumInt(10,20);
        long s = sumLong(100,200);
        double a = sumDouble(10.2,20.3);
        System.out.println(x);
        System.out.println(s);
        System.out.println(a);

    }
    //方法缺点 sumInt sumLong sumDouble 功能不同但相似
    //定义一个计算int类型数据的求和方法
    public static int sumInt(int a ,int b ){
        return a+b;
    }
    //定义一个long类型数据求和方法
    public static long sumLong(long a , long b ){
        return a+b;
    }
    public static double sumDouble(double a, double b){
        return a+b;
    }
}
