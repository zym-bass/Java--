package com.ujiuye.variable;

public class Demo03_��������ע������ {

	public static void main(String[] args) {
		/*1.�����������÷�Χ:
			   �Ա�������λ����,�����������,��������������һ�Դ����ž����������ʹ�÷�Χ*/
		int i = 10;
		
		{
		   int y = 20;	
		   System.out.println(i + y);// 30
		}
		// y cannot be resolved to a variable(y�޷�������һ������)
		// System.out.println(y); ����ԭ����yʹ�ó����������÷�Χ
		System.out.println(i);
		
		// 2.��ͬ�������еı����������ظ�
		int w = 10;
		// int w = 19;
		// Duplicate local variable w : �ظ����ر���w
		// double w = 3.14;
		System.out.println(w);
		
		// 3.���������ͱ�����ֵ���Էֿ�
		//  ���� : int i; // ��������   i = 20; // ������ֵ
		int t;
		// 4. �����ڷ����б���, ���û�и�ֵ����ʹ��
		//The local variable t may not have been initialized(��ʼ��,��ʾ��ֵ)
		// ���ر���t, ����û�и�ֵ
		// System.out.println(t);
		t = 99;
		System.out.println(t);// 99
		
		// 5.��ͬ���ͱ���������������(�˽�)
		int z = 80, v = 20;
	}
}
