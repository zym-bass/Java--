package com.ujiuye.constructor;

public class VariableNew {
	// nameʹ��JVM�����Ĭ�ϸ�ֵ
	private String name;
	// age��ʾ��ֵ
	private int age = 20;
	private String sex = "��";
	
	
	public VariableNew() {
		sex = "Ů";
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
