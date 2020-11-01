package com.yiming.java1101;

public class ThreadTest04 {
    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);//包括线程名称、优先级和线程组。

        //创建线程对象
        MyThread02 t = new MyThread02();

        //查看默认线程名字
        System.out.println(t.getName());
        //设置线程名字
        t.setName("t1");
        //查看新线程名字
        System.out.println(t.getName());

        MyThread02 t2 = new MyThread02();
        t2.setName("t2");
        System.out.println(t2.getName());
        t.start();
        t2.start();

    }
}
class MyThread02 extends Thread{
    @Override
    public void run() {
        for(int i =0;i<10000 ; i++){
            System.out.println(Thread.currentThread().getName()+"线程运行了->" + i);
            try {
                Thread.sleep(1000);//synchronize
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
