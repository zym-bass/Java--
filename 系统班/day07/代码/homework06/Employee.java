package com.ujiuye.homework06;

public class Employee {
	// ����name,����id,����salary
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
