package com.ujiuye.homework06;

public class Teacher {
	// ���ԣ�����name������age����������content 
	private String name;
	private int age;
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void eat() {
		System.out.println("����Ϊ" + age + "��" + name + "��ʦ,���ڳԷ�...");
	}
	
	public void teach() {
		System.out.println("����Ϊ" + age + "��" + name + "��ʦ���ڿ��ܵĽ���" + content);
	}

}
