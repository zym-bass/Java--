package com.ujiuye.thread;

// SaleTickets���ʾ��Ʊ�����߳���
public class SaleTickets implements Runnable {
	// tickets��ʾĿǰʣ���Ʊ��
	int tickets = 50;
    // run�������������Ҫ�������е�, ��Ʊ����
	@Override
	public void run() {
		while(tickets > 0) {
			synchronized ("abc") {
				if(tickets > 0) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
						+ "Ŀǰ�������۵�" + tickets-- + "��Ʊ" );
				}
			}
		}
	}
}
