package com.ujiuye.thread;

public class Demo03_ThreadDaemon {

	public static void main(String[] args) {
		    // �����ڲ�����ʽ, �������߳�
			Thread t0 = new Thread("�ػ�") {
						@Override
						public void run() {
								for(int i = 1; true ; i++) {
									System.out.println(getName() + "---" + i);
								}
							}
						};
						t0.setDaemon(true);
						t0.start();
						
						
				// �����ڲ�����ʽ, �������߳�
				Thread t1 = new Thread("���ػ�") {
							@Override
							public void run() {
									for(int i = 1; i <= 5; i++) {
										System.out.println(getName() + "---" + i);
									}
								}
							};
							
							t1.start();
	         }

}
