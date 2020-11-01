package com.yiming.java1101;
/*
    如何合理的终止一个线程的执行。这种方式是很常用的。
*/

public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable06  r = new MyRunnable06();
        Thread t6 = new Thread(r);
        t6.setName("t6");
        t6.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r.run = false;

    }
}
class MyRunnable06 implements Runnable{
    boolean run = true;

    @Override
    public void run() {
        for(int i = 0 ;i<10 ;i++){
            if(run){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}
