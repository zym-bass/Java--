package com.ujiuye.thread;

public class Demo01_ThreadNameMethod {

	public static void main(String[] args) {
		// 匿名内部类形式, 创建出线程
		Thread t0 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 50; i++) {
					// 1. getName() : 获取到当前线程的名称
					System.out.println(getName() + "---" + i);
				}
			}
		};
		
		t0.start();
		// 2.setName(String name) : 修改线程名称为参数name 
		t0.setName("线程1");
		
		// 3. 通过构造给线程设置名称
		Thread t1 = new Thread("小强") {
			@Override
			public void run() {
				for(int i = 1; i <= 50; i++) {
					System.out.println(getName() + "---" + i);
				}
			}
		};
		t1.start();
		// t1.setName("线程2");
		
		Runnable able = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					// 5.static currentThread() : 获取到当前正在运行的线程对象, 返回Thread线程对象
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		};
		
		// 4. 通过构造给线程设置名称
		Thread t = new Thread(able,"小黑");
		t.start();
		//t.setName("线程3");
		//System.out.println(t.getName());
	}
}
