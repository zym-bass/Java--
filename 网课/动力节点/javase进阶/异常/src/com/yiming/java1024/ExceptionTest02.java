package com.yiming.java1024;

/*
    异常对象有两个非常重要的方法：
        获取异常简单的描述信息：
        String wsa = exception.getMessage();

        打印异常运行的堆栈信息：
        exception.printStackTrace();

*/
public class ExceptionTest02 {
    public static void main(String[] args) {

        NullPointerException c = new NullPointerException("空指针异常");
        //获取异常简单的描述信息
        String msg = c.getMessage();
        System.out.println(msg);

        //打印异常堆栈信息

        c.printStackTrace();
        System.out.println("wew");
        System.out.println("wefw");
    }
}