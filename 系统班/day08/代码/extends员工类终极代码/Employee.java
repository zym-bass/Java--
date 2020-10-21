package com.ujiuye.extendslx;

public class Employee {
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 工号
	private String id;
	// 工资
	private double salary;
	
	// 功能: 工作
	public void work() {
		System.out.println("每个人都需要工作");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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

	// 父类添加有参数构造
	public Employee(String name, int age, String id, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	
	public Employee() {}
}
