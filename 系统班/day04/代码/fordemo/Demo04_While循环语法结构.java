package com.ujiuye.fordemo;

public class Demo04_Whileѭ���﷨�ṹ {

	public static void main(String[] args) {
       // ����1 : ��ӡ1-5��������
		for(int i = 1; i <= 5; i++) {
			// ��ӡ����
			System.out.println("for---"+i);
		}
		
		int j = 1;
		while(j <= 5) {
			System.out.println("while---"+j);
			// ǧ��Ҫ��������ʼ�����j����������
			j++;
		}
		System.out.println(j);// 6
	}

}
