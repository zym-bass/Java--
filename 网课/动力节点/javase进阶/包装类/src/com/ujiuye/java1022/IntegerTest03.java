package com.ujiuye.java1022;
/*
    为什么会出现以下程序
        整数常量池
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false

        /*
            java中为了提高执行效率，
            在方法区创建了整数常量池 范围是-128~127
        */

        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d);//true
    }
}
