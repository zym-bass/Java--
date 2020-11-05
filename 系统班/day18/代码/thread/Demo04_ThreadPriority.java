package com.ujiuye.thread;

public class Demo04_ThreadPriority {

	public static void main(String[] args) {
		Thread t0 = new Thread("�����ȼ�") {
			@Override
			public void run() {
					for(int i = 1; i <= 10; i++) {
						System.out.println(getName() + "---" + i);
					}
				}
			};
			// ����t0�߳�Ϊ��С���ȼ���
			t0.setPriority(Thread.MIN_PRIORITY);
			t0.start();
			
			Thread t1 = new Thread("��ͨ���ȼ�") {
				@Override
				public void run() {
						for(int i = 1; i <= 10; i++) {
							System.out.println(getName() + "---" + i);
						}
					}
				};
				// ����t1�߳�Ϊ��ͨ���ȼ���
				t1.setPriority(Thread.NORM_PRIORITY);
				t1.start();
				
				Thread t2 = new Thread("������ȼ�") {
					@Override
					public void run() {
							for(int i = 1; i <= 10; i++) {
								System.out.println(getName() + "---" + i);
							}
						}
					};
					// ����t2�߳�Ϊ������ȼ���
					t2.setPriority(Thread.MAX_PRIORITY);
					t2.start();
	}
}
