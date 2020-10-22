package com.yiming.java1021;

public class StringTest01 {
    public static void main(String[] args){
        String a = "123";
        String b = "123";
        System.out.println(a == b);//true

        String a1 = new String("123");

        System.out.println(a1 == a);//false
        System.out.println(a1 == b);//false

        //String中重写了equals()方法 instanceof

        System.out.println(a1.equals(a));//true

        String k = null;

        //不存在空指针异常
        System.out.println("asdf".equals(k));


        //存在空指针异常风险
        //System.out.println(k.equals("asdf"));

    /*
        String s = new String {"werwrwr"};
        //创建了两个对象  一个在堆内存创建了一个对象,一个在方法区创建了字符常量区
    */
        //创造字符串对象最常用的一种方式
        String x = "1234567";

        //String 构造方法
        byte[] bytes  = {97,98,99};//97是a 98 b  99 c
        String s2 = new String(bytes);
        //输出字符串对象的话，输出的不是对象的内存地址，而是字符串常量
        System.out.println(s2);

        //String s3 = new String(字节数组 , 数组元素下标的起始位置 , 长度);
        String s3 = new String(bytes , 0,2);//ab
        System.out.println(s3);
        String s4 = new String(bytes , 1, 2);//bc
        System.out.println(s4);

        //将char数组类型全部转换成字符串
        char[] chars = {'中','国','人'};
        String s5 = new String(chars);
        System.out.println(s5);
        String s6 = new String(chars , 0,2);
        System.out.println(s6);
    }
}
