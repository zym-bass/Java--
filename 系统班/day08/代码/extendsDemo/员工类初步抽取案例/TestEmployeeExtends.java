package com.ujiuye.extendsDemo;

public class TestEmployeeExtends {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name = "����Ա";
		p.age = 20;
		p.id = "001";
		p.salary = 10000;
		
		p.work();
		
		XingMuManager m = new XingMuManager();
		m.name = "��Ŀ����";
		m.age = 25;
		m.id = "xm001";
		m.salary = 10000;
		
		m.setJiangJin(3000);
		m.work();
		System.out.println("���½���Ϊ:" + m.getJiangJin());
	}
}
