package com.ujiuye.cal;

public class Demo06_��Ԫ����� {

	public static void main(String[] args) {
		// ����1 : �����һ������������, �ж����������������ż��
		int i = 11;
		// ���ʽ1 ? ���ʽ2 : ���ʽ3;
		String s = i % 2 == 0 ? i + "��ż��" : i + "������";
		System.out.println(s);
		
		// ����2 : ���������������������, ��ȡ�������еĽϴ�ֵ
		double d1 = 5.77;
		double d2 = 5.77;
		double max = d1 >= d2 ? d1 : d2;
		System.out.println("�����еĽϴ�ֵΪ: "+max);
	}
}
