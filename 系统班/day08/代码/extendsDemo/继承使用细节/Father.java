package com.ujiuye.extendsDemo;

public class Father {
    // 1. ��Ա����
	int i = 10;
	static int w = 99;
	private int fa = 888;
	
	// 2. ��������
	public void eat() {
		System.out.println("�����е�eat����");
	}
	
	public void sleep() {
		System.out.println("�����е�sleep����");
	}
	
	// 3. ���췽��
	public Father() {
		System.out.println("���๹��ִ����");
	}
	
	public Father(int i) {
		this.i = i;
		System.out.println("�����вι���ִ��");
	}
}
