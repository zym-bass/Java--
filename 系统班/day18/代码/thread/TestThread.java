package com.ujiuye.thread;

public class TestThread {

	public static void main(String[] args) {
        // main方法本身就是一个线程
		
		// 再额外创建出另外一个线程
		//3)创建出一个自定义线程类对象
		MyThread my = new MyThread();
		
        // 4)  Thread(Runnable target) : 将需要运行的线程类对象封装在一个Thread类型中, 以后线程运行的就是参数target中的线程内容		
	    Thread th = new Thread(my);
	    
	    // 5) 调用th中start方法运行my线程中内容
	    th.start();
	    
	    for(int i= 1; i <= 10; i++) {
	    	System.out.println("main---" + i);
	    }
	}

}
