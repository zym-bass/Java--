package com.ujiuye.homework06;

public class Employee {
	// 姓名name,工号id,工资salary
	private String name;
	private String id;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void show() {
		System.out.println(name + "---" + id + "---" + salary);
	}
}
