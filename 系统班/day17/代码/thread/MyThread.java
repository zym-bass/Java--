package com.ujiuye.thread;

// 1. 自定义出一个类, 称为Thread类的子类, 于是自定义类属于线程类
public class MyThread extends Thread {
	// 2) 在自定义线程类中, 重写从父类Thread中继承到来的run方法功能,
	// 将需要独立运行的代码逻辑写到run方法中
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("run----" + i);
		}
	}
}
