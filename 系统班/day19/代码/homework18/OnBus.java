package com.ujiuye.homework18;

import java.util.Random;

public class OnBus implements Runnable {
	// seats表示目前车上剩余座位数
    int seats = 80;
    Random ran = new Random();
	
	@Override
	public void run() {
		while(seats > 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 要求每一门可以做完完整上车过程
			synchronized (ran) {
				if(seats > 0) {
					// on表示每次上车的随机人数
					int on = ran.nextInt(seats) + 1;
					// 获取到车上剩余座位数
					seats = seats - on;
					System.out.println(Thread.currentThread().getName() + "上车" + on + "人, 目前车上剩余座位数为 : " + seats);
				}
			}
		}
	}
}
