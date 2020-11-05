package com.ujiuye.thread;

public class Demo01_ThreadNameMethod {

	public static void main(String[] args) {
		// �����ڲ�����ʽ, �������߳�
		Thread t0 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 50; i++) {
					// 1. getName() : ��ȡ����ǰ�̵߳�����
					System.out.println(getName() + "---" + i);
				}
			}
		};
		
		t0.start();
		// 2.setName(String name) : �޸��߳�����Ϊ����name 
		t0.setName("�߳�1");
		
		// 3. ͨ��������߳���������
		Thread t1 = new Thread("Сǿ") {
			@Override
			public void run() {
				for(int i = 1; i <= 50; i++) {
					System.out.println(getName() + "---" + i);
				}
			}
		};
		t1.start();
		// t1.setName("�߳�2");
		
		Runnable able = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					// 5.static currentThread() : ��ȡ����ǰ�������е��̶߳���, ����Thread�̶߳���
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		};
		
		// 4. ͨ��������߳���������
		Thread t = new Thread(able,"С��");
		t.start();
		//t.setName("�߳�3");
		//System.out.println(t.getName());
	}
}
