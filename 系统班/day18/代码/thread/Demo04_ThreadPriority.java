package com.ujiuye.thread;

public class Demo04_ThreadPriority {

	public static void main(String[] args) {
		Thread t0 = new Thread("低优先级") {
			@Override
			public void run() {
					for(int i = 1; i <= 10; i++) {
						System.out.println(getName() + "---" + i);
					}
				}
			};
			// 设置t0线程为最小优先级别
			t0.setPriority(Thread.MIN_PRIORITY);
			t0.start();
			
			Thread t1 = new Thread("普通优先级") {
				@Override
				public void run() {
						for(int i = 1; i <= 10; i++) {
							System.out.println(getName() + "---" + i);
						}
					}
				};
				// 设置t1线程为普通优先级别
				t1.setPriority(Thread.NORM_PRIORITY);
				t1.start();
				
				Thread t2 = new Thread("最高优先级") {
					@Override
					public void run() {
							for(int i = 1; i <= 10; i++) {
								System.out.println(getName() + "---" + i);
							}
						}
					};
					// 设置t2线程为最高优先级别
					t2.setPriority(Thread.MAX_PRIORITY);
					t2.start();
	}
}
