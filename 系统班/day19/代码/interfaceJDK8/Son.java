package com.ujiuye.interfaceJDK8;

public class Son extends Father {
    // �̳е���Father�еľ�̬����  getSum
	// Son�����е�getSum��̬�������Ǵ���д����, ���������Լ�����ľ�̬����
	// ��̬������
	public static int getSum(int x, int y) {
		return (x + y) * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(Son.getSum(3, 5));// 8
	}
}
