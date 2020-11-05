package com.ujiuye.homework17;

public class Homework3 {
    //3. 扩展题目 : 大家试着使用匿名内部类的方式实现出一个多线程, 并开启线程执行线程中的run方法
	public static void main(String[] args) {
          
		new Thread() {// 大括号就表示Thread类的子类实现过程
			// 重写run方法
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					System.out.println("run---" + i);
				}
			}
		}.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("main---" + i);
		}
	}
}
