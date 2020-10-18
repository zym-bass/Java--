
/*
        接口的基础语法：
            1. 类和类之间叫做继承，类和接口之间叫做实现
        继承使用extends关键字继承
        实现使用：implements关键字实现
            2. *****当一个非抽象的类实现接口的话，
            必须讲接口中所有的抽象方法全部实现（覆盖，重写）
 */
public class Test02 {
    public static void main(String[] args){
        //能使用多态吗？
        MyMath02 ms = new MyMathImpl();
        System.out.println(ms.sub(1,2));
    }
}
interface MyMath02 {
    double PI = 3.1415926;
    int sum (int a , int b );
    int sub (int a , int b );
}
//编写一个类（这个类是一个非抽象的类）
//这个类的名字是随意的。
 class MyMathImpl implements MyMath02  {
    //实现接口方法
    public int sum (int a , int b ){
        return a + b ;
    }
    public int sub (int a , int b ){
        return a - b ;
    }
}