package com.ujiuye.thread;

// 1. �Զ����һ����, ʵ��Runnable�ӿ�
public class MyThread implements Runnable {

	// 2. ��дRunnable�е�run��������, ����Ҫ�������еĴ���д��run��
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("runnable---" + i);
		}
	}
}
