package com.ujiuye.exception;

public class Demo07_TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println(useI());// 20
		System.out.println("game over");
	}
	
	public static int useI() {
		try {
			int i = 10 / 0;
			return i;
		}catch(NullPointerException e) {
			int i = 10;
			System.out.println("0����������, ����Ĭ��ֵΪ10");
			return i;
		}finally {// ע�� : ������Ҫ��finally��д��return���, ����̫���̶�
			int i = 20;
			System.out.println("��һ��Ҫ����");
			// return i;
		}
	} 
}
