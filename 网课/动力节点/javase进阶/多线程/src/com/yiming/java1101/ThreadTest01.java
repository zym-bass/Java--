package com.yiming.java1101;


public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();

        for(int i = 0 ;i<1000 ; i++){
            System.out.println("主线程==>" + i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序，这段线程程序运行在分支线程中（分支栈）
        for(int i = 0 ; i<1000 ; i++){
            System.out.println("分支线程-->" + i);
        }
    }
}
