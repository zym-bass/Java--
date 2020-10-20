package com.ujiuye.constructor;

public class ConstructorParam {
	private String name;
	private int age;
	
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
    // �����������췽������
	// ������в������췽��
	public ConstructorParam(String name, int age) {
		// ���췽���ĵ���,����д�ڹ�������Ч�е�һ��
		//Constructor call must be the first statement in a constructor
		this(name);
		//this.name = name;
		this.age = age;
	}
	
	public ConstructorParam(String name) {
		this.name = name;
		System.out.println("����һ�������Ĺ��췽��, �ұ�������");
	}
	
	// �����һ���ղ�������
	public ConstructorParam() {
		name = "������";
		age = 18;
	}
	
	public static void main(String[] args) {
		// �����в�������, ����ʵ�ʲ���
		ConstructorParam cp = new ConstructorParam("����", 20);
		System.out.println(cp.getAge());// 20
		System.out.println(cp.getName());// ����
		
		ConstructorParam cp1 = new ConstructorParam("����", 19);
		System.out.println(cp1.getName());// ����
		System.out.println(cp1.getAge());// 19
		
		// ���ÿղ�������
		ConstructorParam cp2 = new ConstructorParam();
		System.out.println(cp2.getName());// ������
		System.out.println(cp2.getAge());// 18
	}
}
