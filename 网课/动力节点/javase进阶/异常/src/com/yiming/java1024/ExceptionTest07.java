package com.yiming.java1024;

public class ExceptionTest07 {
    public static void main(String[] args){
        //final是一个关键字
        final int S = 100;
        // S = 100;

        //finally 是一个关键字，和try联合使用，使用在异常处理机制中
        //在finally语句块中的代码是一定会被执行
        try{

        }finally {
            System.out.println("finally.....");
        }
        //finalize()是Object类中的一个方法，作为方法名出现
        //所以finalize是标识符
        //Object.finalize();//启动垃圾回收机

    }
}
