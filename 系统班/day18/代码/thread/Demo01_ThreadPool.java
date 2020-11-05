package com.ujiuye.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01_ThreadPool {

	public static void main(String[] args) {
		Runnable run1 =  new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() +"--"+i);
				}
			}
         };
         
         Runnable run2 =  new Runnable() {
 			@Override
 			public void run() {
 				for(int i = 1; i <= 5; i++) {
 					System.out.println(Thread.currentThread().getName() +"--"+i);
 				}
 			}
          };
          
          Runnable run3 =  new Runnable() {
  			@Override
  			public void run() {
  				for(int i = 1; i <= 5; i++) {
  					System.out.println(Thread.currentThread().getName() +"--"+i);
  				}
  			}
           };
           
           Runnable run4 =  new Runnable() {
   			@Override
   			public void run() {
   				for(int i = 1; i <= 5; i++) {
   					System.out.println(Thread.currentThread().getName() +"--"+i);
   				}
   			  }
            };
            
            // 1. ������һ���̳߳�, ���������߳�����
            ExecutorService es = Executors.newFixedThreadPool(2);
            // 2. submit�����ύ�߳�����
            es.submit(run1);
            es.submit(run2);
            es.submit(run3);
            es.submit(run4);
            
            // 3. �����̳߳�
            // es.shutdown();
            es.shutdownNow();
	}
}
