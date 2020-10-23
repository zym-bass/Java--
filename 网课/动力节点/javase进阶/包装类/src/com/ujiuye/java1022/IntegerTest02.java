package com.ujiuye.java1022;

/*
    在Java5之后的，引用了一种新特性，自动装箱和自动拆箱
    自动类型：基本数据类型自动转换包装类
    自动拆箱：包装类自动转换成基本数据类型

    有了自动拆箱：Number类中方法就用不着了

*/
public class IntegerTest02 {
    public static void main(String[] args){
        //900是基本数据类型
        //x是包装类型
        //基本数据类型（自动转换）；包装类型 自动装箱

        Integer x = 900;
        System.out.println(x);
        //x 是包装类型
        //y 是基本数据类型
        //包装类型 （自动转换），基本数据类型， 自动拆箱

        int y = x ;
        System.out.println(y);

        //m保存了对象的内存地址
        Integer m = 1000;;
        System.out.println(m+1);

    }
}
