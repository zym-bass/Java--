package com.ujiuye.thread;

public class TestThread {

	public static void main(String[] args) {
        // 1. main方法本身就是一个线程
		// 2. 自定出一个额外线程通道, 执行独立代码
		// 3)创建出一个自定义的线程类对象, 表示准备有一个独立代码执行通道
		MyThread my = new MyThread();
		my.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("main---" + i);
		}
	}
}
