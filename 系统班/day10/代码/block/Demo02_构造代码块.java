package com.ujiuye.block;

public class Demo02_�������� {
	private String name;
	private int age;
    // ��������
	{
		name = "����";
		age = 20;
		System.out.println("���ǹ�������");
		System.out.println("���ǹ��췽��----lalalalal");
	}
	
	public Demo02_��������() {
		// System.out.println("���ǹ��췽��----lalalalal");
	}
	
	public Demo02_��������(String name) {
		this.name = name;
		// System.out.println("���ǹ��췽��----lalalalal");
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

	public static void main(String[] args) {
        // 1. ������һ��Demo02_�����������
		Demo02_�������� demo = new Demo02_��������();
		System.out.println(demo.getName());// ����
		System.out.println(demo.getAge());// 20
		
		Demo02_�������� demo2 = new Demo02_��������("Сǿ");
		System.out.println(demo2.getName());
	}
}
