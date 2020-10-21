package com.yiming.java1021;
/*
    hashCode()方法返回的是哈希码
        实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值
        所以hashCode()方法的执行结果可以等同看做一个Java对象的内存地址
*/
public class HashClassTest {
    public static void main(String[] args){
        Object a = new Object();
        int hashCodeValue = a.hashCode();
        System.out.println(hashCodeValue);

        Object a1 = new Object();
        int hashCodeValue01 = a1.hashCode();
        System.out.println(hashCodeValue01);
    }
}
class MyClass{
}
