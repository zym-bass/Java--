package com.ujiuye.variable;

public class Demo05_ǿ������ת�� {

	public static void main(String[] args) {
		// 1. ǿ������ת�����ݲ���ʧ
		//��ʽ :С�������� = (С��������)��Ҫת������������;
		int i = 88;
		byte b = (byte)i;
		System.out.println(b);// 88
		
		// 2. ǿ������ת�����ݶ�ʧ
		int w = 1000;
		byte b1 = (byte)w;
		System.out.println(b1);// -24
		
		
		double d = 3.001;
		int t = (int)d;
		System.out.println(t);// 3
	}
}
