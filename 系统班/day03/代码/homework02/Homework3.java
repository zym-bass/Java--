package com.ujiuye.homework02;

public class Homework3 {

	public static void main(String[] args) {
		short s1 = 1; 
		//Type mismatch: cannot convert from int to short
		// 1) s1��int��������1���мӷ�����, ����short���͵ı���s1��Ҫ�Զ���������Ϊint
		// 2) 1 + 1 = 2(int����)
		// 3) int���ʹ���short���͵�, �����Ͳ���ֱ�Ӹ�С��������ֱ�Ӹ�ֵ
		s1 = (short)(s1 + 1);
	}
}
