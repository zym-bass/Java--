package com.ujiuye.fordemo;

public class Demo04 {
	

	public static void main(String[] args) {
		// ����2 : ��ӡ��1-100�����п��Ա�7��������
		/*
		* ���� :
		* 1) ��ȡ��1-100�е�ÿһ������, ����֪��������ܲ��ܱ�7����(���1-100ѭ��)
		* 2) ��ѭ����, ��ȡ��ÿһ����, ʹ���߼���֤ % 7 == 0 ,��ô���
		*/
	
		int i = 1;
		while(i <= 100) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
				// ǧ��Ҫ��������ʼ�����i����������
			i++;
		}
		
		System.out.println("--------------");
		
		for(int w = 1; w <= 100; w++) {
			if(w % 7 == 0) {
			System.out.println(w);
			}
		}
	}
}
