package com.ujiuye.homework17;

public class Homework3 {
    //3. ��չ��Ŀ : �������ʹ�������ڲ���ķ�ʽʵ�ֳ�һ�����߳�, �������߳�ִ���߳��е�run����
	public static void main(String[] args) {
          
		new Thread() {// �����žͱ�ʾThread�������ʵ�ֹ���
			// ��дrun����
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					System.out.println("run---" + i);
				}
			}
		}.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("main---" + i);
		}
	}
}
