package com.ujiuye.object;

public class Person {
	// 1. ��Ա����(ȫ�ֱ���)
	// ����
	String name;
	// ����
	int age;
	// �Ա�
	String sex;
	
	// 2. �������������
	public void eat() {
		System.out.println(name + "���ڳԷ�");
	}
	
	public void sleep() {
		System.out.println(name + "Ŀǰ�Ѿ�˯��" + age + "��");
	}
	
	public void work() {
		System.out.println(name + "��" + sex + ", ��������Ϊ : " + age);
	}
}
