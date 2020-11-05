package com.ujiuye.thread;

public class TestSaleTickets {
	public static void main(String[] args) {
		// 1. 同步代码块解决线程安全问题的测试代码
		SaleTickets st = new SaleTickets();
        // 定义出三个线程
		Thread t1 = new Thread(st,"美团");
		Thread t2 = new Thread(st, "猫眼");
		Thread t3 = new Thread(st, "影院");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		// 2. 同步方法解决线程安全问题的测试代码
		/*SaleTicketsMethodSave stms = new SaleTicketsMethodSave();
		// 定义出三个线程
		Thread t1 = new Thread(stms,"美团");
		Thread t2 = new Thread(stms, "猫眼");
		Thread t3 = new Thread(stms, "影院");
				
		t1.start();
		t2.start();
		t3.start();*/
	}
}
