package com.ujiuye.extendslx;

public class Employee {
	// ����
	private String name;
	// ����
	private int age;
	// ����
	private String id;
	// ����
	private double salary;
	
	// ����: ����
	public void work() {
		System.out.println("ÿ���˶���Ҫ����");
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

	// ��������в�������
	public Employee(String name, int age, String id, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	
	public Employee() {}
}
