package com.ujiuye.thread;

public class Demo03_ThreadDaemon {

	public static void main(String[] args) {
		    // 匿名内部类形式, 创建出线程
			Thread t0 = new Thread("守护") {
						@Override
						public void run() {
								for(int i = 1; true ; i++) {
									System.out.println(getName() + "---" + i);
								}
							}
						};
						t0.setDaemon(true);
						t0.start();
						
						
				// 匿名内部类形式, 创建出线程
				Thread t1 = new Thread("非守护") {
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
