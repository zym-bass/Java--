package com.ujiuye.thread;

// 1. �Զ����һ����, ��ΪThread�������, �����Զ����������߳���
public class MyThread extends Thread {
	// 2) ���Զ����߳�����, ��д�Ӹ���Thread�м̳е�����run��������,
	// ����Ҫ�������еĴ����߼�д��run������
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("run----" + i);
		}
	}
}
