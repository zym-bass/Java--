package com.yiming.java1101;

public class ThreadTest03 {
    public static void main(String[] args){

        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i =0;i<10000 ; i++){
                    System.out.println("线程运行了->" + i);
                }
            }
        });
        t.start();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i=0 ;i<10000 ; i++){
                    System.out.println("2线程运行了->" + i);
                }
            }
        };
        t1.start();

        for(int i =0 ; i<10000 ;i++){
            System.out.println("主线程运行了->" + i);
        }



    }
}
