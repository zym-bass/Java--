package com.yiming.java28;


/*
    java.io.printStream : 标准字节输出流，默认输出到控制台
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        //联合起来
        System.out.println("你是笨笨吗？");

        //分开写
        PrintStream ps = System.out;
        ps.println("你是笨笨吗？");

        //标准输出流不需要手动close()关闭


        //修改输出位置
        PrintStream as = new PrintStream(new FileOutputStream("copy1"));

        System.setOut(as);

        System.out.println("你是笨笨吗？");
        System.out.println("你是笨笨吗？");
        System.out.println("你是笨笨吗？");
    }
}
