package com.yiming.java1101;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest09 {
    public static void main(String[] args) {
        //创建1个仓库对象，共享的
        List list = new ArrayList();
        //创建两个线程对象
        //生产者线程
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();

    }

}
class Producer implements Runnable{
    //仓库
    private List list;

    public Producer() {
    }

    public Producer(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        int i =0;
        while(true){
            synchronized(list) {
                if (list.size() > 0) {
                    //当前线程进入等待状态
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    list.add(i++);
                    System.out.println(list);
                    list.notify();
                }
            }
        }
    }
}
class Consumer implements Runnable{
    public Consumer(List list) {
        this.list=list;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    //仓库
    private List list;
    @Override
    public void run() {
        while(true){
            synchronized(list) {
                if (list.size() == 0) {
                    //当前线程进入等待状态
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{

                    list.remove(0);
                    System.out.println(list);
                    list.notify();
                }
            }
        }
    }
}
