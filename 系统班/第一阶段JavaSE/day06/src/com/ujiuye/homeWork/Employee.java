package com.ujiuye.homeWork;

public class Employee {
	//����
	private String name ;
	//����
	private String id;
	//����
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
		System.out.println(name+"�Ĺ�����"+id+"������"+salary);
	}
}
