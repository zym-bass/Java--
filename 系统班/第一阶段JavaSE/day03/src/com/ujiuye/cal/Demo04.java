package com.ujiuye.cal;

import java.util.Scanner;
public class Demo04 {
	private static Scanner sc;
	public static void main(String[] args) {
		// ���� : ͨ������¼����������, �����������е����ֵ
		sc = new Scanner(System.in);
		// ��ε���nextInt��������, ��Ҫ��������
		System.out.println("�������һ������:");
		int first = sc.nextInt();
		System.out.println("������ڶ�������:");
		int second = sc.nextInt();
		System.out.println("���������������:");
		int third = sc.nextInt();
		// �������Ƚ����ֵ : ˼·���������Ƚ�
		// 1) ��first��second�Ƚϳ�һ���ϴ�ֵ
		// 2) �ýϴ�ֵ��third�ȳ����ֵ
		// max��ʾ���ֵ
		int max = first >= second ? first : second;
		max = max >= third ? max : third;
		System.out.println("�������е����ֵΪ: " + max);
		sc.close();
	}
	
}