package com.ujiuye.constructor;

public class VariableNew {
	// name使用JVM虚拟机默认赋值
	private String name;
	// age显示赋值
	private int age = 20;
	private String sex = "男";
	
	
	public VariableNew() {
		sex = "女";
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



	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		VariableNew vn = new VariableNew();
		System.out.println(vn.getName());
		System.out.println(vn.getAge());
		System.out.println(vn.sex);
		
		
	}
}
