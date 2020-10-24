package com.yiming.java1024;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    深入try ...catch
        1. catch 后面的小括号中的类型可以是具体的异常类型，有可以是异常类型的父类型
        2. catch 可以写多个


*/

public class ExceptionTest01 {
    public static void main(String[] args)  {
        m1();
        System.out.println("main");

    }
    private static void m1()  {
        try {
            m2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void m2() throws FileNotFoundException {
        m3();
    }
    private static void m3()throws FileNotFoundException {

        new FileInputStream("");
    }
}
