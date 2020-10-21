package com.ujiuye.extendsDemo;

public class TestEmployeeExtends {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name = "程序员";
		p.age = 20;
		p.id = "001";
		p.salary = 10000;
		
		p.work();
		
		XingMuManager m = new XingMuManager();
		m.name = "项目经理";
		m.age = 25;
		m.id = "xm001";
		m.salary = 10000;
		
		m.setJiangJin(3000);
		m.work();
		System.out.println("本月奖金为:" + m.getJiangJin());
	}
}
