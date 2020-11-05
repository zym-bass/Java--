package com.ujiuye.thread;

// SaleTickets类表示售票过程线程类
public class SaleTicketsMethodSave implements Runnable {
	// tickets表示目前剩余的票数
	static int tickets = 10;
    // run方法中设计了需要独立运行的, 售票过程
	@Override
	public void run() {
		while(tickets > 0) {
			sales2();
		}
	}
	
	// 静态同步方法
	public static synchronized void sales2() {
		// synchronized (SaleTicketsMethodSave.class) {
			if(tickets > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
					+ "目前正在销售第" + tickets-- + "张票" );
			}
		//}
	}
	
	// 非静态同步方法
	public synchronized void sales() {
		//synchronized (this) {
			if(tickets > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
					+ "目前正在销售第" + tickets-- + "张票" );
			}
		//}
	}
}
