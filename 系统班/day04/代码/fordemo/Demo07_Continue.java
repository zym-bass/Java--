package com.ujiuye.fordemo;

public class Demo07_Continue {

	public static void main(String[] args) {
		// continue���� : ��ӡ��1-100������ż������
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				// �������ݲ���Ҫ��ӡ, ����ѭ�����Խ���
				continue;
			}
			System.out.println(i);
		}
	}
}
