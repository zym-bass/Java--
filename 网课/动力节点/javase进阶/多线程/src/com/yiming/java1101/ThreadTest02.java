package com.yiming.java1101;

public class ThreadTest02 {
    public static void main(String[]  args){
//
//        //创建Runnable 的子类
//        MyRunnable r = new MyRunnable();
//        //调用Thread 的有参构造 Thread(Runnable)
//        //将MyRunnable封装成一个对象
//        Thread t = new Thread(r);

        Thread t = new Thread(new MyRunnable());//合并代码
        //启动线程
        t.start();
        for(int i = 0 ;i<1000 ; i++){
            System.out.println("主线程==>" + i);
        }
    }
}

//这个并不是要给线程
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<1000 ; i++){
            System.out.println("分支线程-->" + i);
        }
    }
}
