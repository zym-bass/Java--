package com.ujiuye.thread;

// SaleTickets���ʾ��Ʊ�����߳���
public class SaleTicketsMethodSave implements Runnable {
	// tickets��ʾĿǰʣ���Ʊ��
	static int tickets = 10;
    // run�������������Ҫ�������е�, ��Ʊ����
	@Override
	public void run() {
		while(tickets > 0) {
			sales2();
		}
	}
	
	// ��̬ͬ������
	public static synchronized void sales2() {
		// synchronized (SaleTicketsMethodSave.class) {
			if(tickets > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
					+ "Ŀǰ�������۵�" + tickets-- + "��Ʊ" );
			}
		//}
	}
	
	// �Ǿ�̬ͬ������
	public synchronized void sales() {
		//synchronized (this) {
			if(tickets > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
					+ "Ŀǰ�������۵�" + tickets-- + "��Ʊ" );
			}
		//}
	}
}
