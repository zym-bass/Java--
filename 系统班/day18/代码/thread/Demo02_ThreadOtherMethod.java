package com.ujiuye.thread;

public class Demo02_ThreadOtherMethod {

	public static void main(String[] args) {
		 /*for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName() + "---" + i);
		 }*/
		
		   // 匿名内部类形式, 创建出线程
			Thread t0 = new Thread() {
				@Override
				public void run() {
						for(int i = 1; i <= 50; i++) {
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(getName() + "---" + i);
						}
					}
				};
				
				t0.start();
	    }
}
