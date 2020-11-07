package com.yiming.java11;

import java.util.Arrays;

/*
    变边长度参数
        int....args就是可变长度参数
        语法是：类型...（注意：一定是3个点）
        1. 可变长度参数要求的参数个数是：0~N个
        2. 可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个
        3. 可变长度参数可以当做一个数组来看待

*/
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,1999,100,24,25,5,5,3,53,53,5);

        int[] i = {1,2,344,5,5,6,6,6,6,7,7};
        m(i);


        m2("lalalal",123,1313,13,13,1,31,3,1,3,13,1,31,3,1);

    }
    public static int s(String name , int m){
        System.out.println(name+m);
        return 10;
    }
    public static void m(int...args){
        System.out.println(args.length);
        for(int i =0 ;i<args.length ;i++){
            System.out.println(args[i]);
        }
        System.out.println("m方法执行了！");
    }
    public static void m2(String name,int...args){
        System.out.println(args.length);

        System.out.println("m方法执行了！");
    }
    public static void m3(int...args){
        System.out.println(args.length);

        System.out.println("m方法执行了！");
    }
}
