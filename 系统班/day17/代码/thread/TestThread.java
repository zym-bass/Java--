package com.ujiuye.thread;

public class TestThread {

	public static void main(String[] args) {
        // 1. main�����������һ���߳�
		// 2. �Զ���һ�������߳�ͨ��, ִ�ж�������
		// 3)������һ���Զ�����߳������, ��ʾ׼����һ����������ִ��ͨ��
		MyThread my = new MyThread();
		my.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("main---" + i);
		}
	}
}
