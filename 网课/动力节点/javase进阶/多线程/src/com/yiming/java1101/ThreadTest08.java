package com.yiming.java1101;

/*
    实现线程的第三种方式：
        实现Callable接口
        这种方式优点：可以获取到线程的执行结果
        这种方式的缺点是：效率比较低，在获取t线程执行结果的时候，当前线程受阻，效率较低

*/

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest08 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步：创建一个“未来任务类”对象
        FutureTask task = new FutureTask(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000*2);
                System.out.println("call method end! ");
                int a = 100;
                int b = 200;
                return a+b;
            }

            @Override
            public String toString() {
                return super.toString();
            }
        });

        Thread t = new Thread(task);
        t.start();
        Thread.sleep(2000);
        Object o = task.get();
        System.out.println(o);
    }
}
