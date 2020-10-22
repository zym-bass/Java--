package com.yiming.java1022;
/*

       java.long.StringBuilder
       StringBuffer和 StringBuiler 的区别？
        StringBuffer中的方法都行：
        synchronized关键字修饰。表示StringBuffer在多线程环境下运行时安全的。

        StringBuilder中的方法都没有：
        synchronized关键字修饰，表示StringBuilder在多线程环境下运行时是不安全的

        StringBuffer 是线程安全的
        StringBuilder 是非线程安全的

*/

public class StringBuilderTest01 {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder(100);
        s.append(13131414);
        s.append("sfljgj");
        System.out.println(s);


    }
}
