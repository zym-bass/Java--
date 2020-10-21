package com.ujiuye.extendsDemo;

// Employee员工类表示公司中所有员工
public class Employee {
    // 姓名, 年龄, 工号, 工资, 功能: 工作
	String name;
	int age;
	String id;
	double salary;
	
	public void work() {
		System.out.println(name + "员工,工作了" + age + "年, 员工编号为" + id + ",薪资为" + salary);
	}
}
