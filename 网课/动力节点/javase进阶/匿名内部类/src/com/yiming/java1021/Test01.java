package com.yiming.java1021;
/*
    1.匿名内部类：
       1.什么是内部类？
        内部类：在类的内部又定义一个新的类，被称为内部类
       2.内部类的分类：
        静态内部类：类似于静态变量
        实例内部类：类似于实例变量
        局部内部类：类似于局部变量
       3. 使用内部类编写的代码，可读性太差
       4. 匿名内部类，可读性太差

*/
public class Test01 {
    //该类在类的内部，所以称为内部类
    //由于前面有static ,所以称为“静态内部类”
    static class Tnner1{

    }


    //该类在类的内部，所以称为内部类
    //没有static 叫做实例内部类
    class Tnner2{
    }

    public void doSome(){
        //局部变量
        int i = 100;
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Tnner3{

        }
    }
    public void doOther(){
        //dosome()方法中的局部内部类Tnner3,在doOther()中不能使用
    }

    public static void main(String[] args){
        //调用MyMath中的sum方法
        MyMath m = new MyMath();
        //方式一
        /*ComputeImo1 s = new ComputeImo1();
        m.sum(s , 24,34);*/
        //方式二
        //m.sum(new ComputeImo1() , 24,34);

        //匿名内部类
        //方式三
        m.sum(new Compute(){
            //代表对接口的实现
            public int sum(int a , int b){
                return a + b ;
            }
        } , 24,3);

    }

}
//计算接口
interface  Compute {
    //抽象方法
    int sum(int a , int b );
}
/*class ComputeImo1 implements Compute{
    public int sum(int a, int b){
        return a + b ;
    }
}*/
class MyMath{
    //数学求和方法
    public void sum(Compute o  , int a, int y){
        int revalue = o.sum(a,y);
        System.out.println(a + "..." + y + "..." + revalue);
    }
}
