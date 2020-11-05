package com.ujiuye.thread;

// 1. 自定义出一个类, 实现Runnable接口
public class MyThread implements Runnable {

	// 2. 重写Runnable中的run方法功能, 将需要独立运行的代码写在run中
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("runnable---" + i);
		}
	}
}
