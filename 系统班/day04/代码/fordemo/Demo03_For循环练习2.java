package com.ujiuye.fordemo;

public class Demo03_Forѭ����ϰ2 {

	public static void main(String[] args) {
		// ����3 : ��ӡ1-100�ۼӺ�
		/*
		 *  ���� :
		 *    1) ��Ҫ��ȡ��1-100�е�ÿһ������(��Ƴ�һ��1-100����ѭ��)
		 *    2) ����ȡ����ÿһ��������ѭ���н����ۼ�
		 * 
		 * */
		// sum�������ڱ�ʾ1-100�������ݵ��ۼӺͽ��
		// ��forѭ��С�����ж���ı��� i , ֻ����forѭ���Ĵ�������ʹ��, ����forѭ��������
		// �������������÷�Χ
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// ѭ����iֵ����1-100��ÿһ������
			sum = sum + i;// sum += i;
		}
		System.out.println(sum);
		// System.out.println(i);
	}
}
