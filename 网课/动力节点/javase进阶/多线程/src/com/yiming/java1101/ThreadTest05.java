package com.yiming.java1101;

public class ThreadTest05 {
    public static void main(String[] args) {
        MyThread05 t05 = new MyThread05();
        t05.setName("t05");
        t05.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t05.interrupt();//干扰

    }
}

class MyThread05 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begin-->");
        try {
            Thread.sleep(1000*60*60*24);//synchronize
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end-->");

    }
}
