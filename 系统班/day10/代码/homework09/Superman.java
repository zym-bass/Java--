package com.ujiuye.homework09;

public class Superman extends Man {
	@Override
	public void dealBusiness() {
		System.out.println(getName() + "��̸���ڴ�����");
	}
	
	public void fly() {
		System.out.println(super.getName() + "���ڷ�,���ž���");
	}
}
