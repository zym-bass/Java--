package com.ujiuye.block;

public class Demo01_�ֲ������ {

	public static void main(String[] args) {
		int j = 88;
        // �ֲ������
		{
		   // 1. �޶������ھֲ�������еı���ʹ�÷�Χ
		   int i = 10;	// ��������
		   System.out.println(i);
		   j = 99;// ������ֵ, �ֲ���������jֵ, ���ᷢ��Ӱ��, ����ʹ��
		}
		// i cannot be resolved to a variable
		// System.out.println(i);
		System.out.println(j);// 99
		
	}
}
