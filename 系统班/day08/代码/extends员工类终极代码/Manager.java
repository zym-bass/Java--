package com.ujiuye.extendslx;

public class Manager extends Employee {
	// ����
	private double jiangJin;

	public double getJiangJin() {
		return jiangJin;
	}

	public void setJiangJin(double jiangJin) {
		this.jiangJin = jiangJin;
	}
	
	@Override
	public void work() {
		System.out.println(super.getName() + "--" + super.getAge() + "--" + super.getId() + "--" + super.getSalary()+"�����ල��Ŀ����, Э��������Ա�������, ����" + jiangJin );
	}
	
	public Manager(String name, int age, String id, double salary,double jiangJin) {
		super.setName(name);
		super.setAge(age);
		super.setId(id);
		super.setSalary(salary);
		this.jiangJin = jiangJin;
		
	}
}
