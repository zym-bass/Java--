package com.ujiuye.homeWork;

public class Employee {
	//姓名
	private String name ;
	//工号
	private String id;
	//工资
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void show() {
		System.out.println(name+"的工号是"+id+"工资是"+salary);
	}
}
