package com.ujiuye.homework18;

import java.util.Random;

public class OnBus implements Runnable {
	// seats��ʾĿǰ����ʣ����λ��
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
			// Ҫ��ÿһ�ſ������������ϳ�����
			synchronized (ran) {
				if(seats > 0) {
					// on��ʾÿ���ϳ����������
					int on = ran.nextInt(seats) + 1;
					// ��ȡ������ʣ����λ��
					seats = seats - on;
					System.out.println(Thread.currentThread().getName() + "�ϳ�" + on + "��, Ŀǰ����ʣ����λ��Ϊ : " + seats);
				}
			}
		}
	}
}
