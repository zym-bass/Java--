package com.ujiuye.extendslx;

public class Program extends Employee {
    // Employee�����е�4��˽�г�Ա�����޷��̳�ʹ��
	// Program���Լ̳�4��˽�г�Ա������Ӧ��ӷ��ʷ�ʽ, set��get����
	// ���Լ̳�work����
	@Override
	public void work() {
		// System.out.println("ÿ���˶���Ҫ����");
		super.work();
		System.out.println(super.getName() + "--" + super.getAge() + "����Ա�������ǿ���");
	}
	
	public Program() {
		// super(); Ĭ�ϴ���
	}
	
	public Program(String name, int age, String id, double salary) {
		super(name,age,id,salary);
	}
}
