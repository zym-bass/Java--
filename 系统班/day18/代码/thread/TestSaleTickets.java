package com.ujiuye.thread;

public class TestSaleTickets {
	public static void main(String[] args) {
		// 1. ͬ����������̰߳�ȫ����Ĳ��Դ���
		SaleTickets st = new SaleTickets();
        // ����������߳�
		Thread t1 = new Thread(st,"����");
		Thread t2 = new Thread(st, "è��");
		Thread t3 = new Thread(st, "ӰԺ");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		// 2. ͬ����������̰߳�ȫ����Ĳ��Դ���
		/*SaleTicketsMethodSave stms = new SaleTicketsMethodSave();
		// ����������߳�
		Thread t1 = new Thread(stms,"����");
		Thread t2 = new Thread(stms, "è��");
		Thread t3 = new Thread(stms, "ӰԺ");
				
		t1.start();
		t2.start();
		t3.start();*/
	}
}
