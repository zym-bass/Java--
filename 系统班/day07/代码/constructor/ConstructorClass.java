package com.ujiuye.constructor;

public class ConstructorClass {
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

	/*
	  * ���η� ���췽����(�����б�){
	           ������;// ��Ҫ���Ǹ������еĳ�Ա�������и�ֵ����
	   }
	 */
	 public ConstructorClass() {
		 name = "����";
		 age = 20;
		 System.out.println(name + "---" + age);
		 // return;
	 }
	 
	 public static void main(String[] args) {
		 // ���ÿղ������췽��
		 ConstructorClass cc = new ConstructorClass();
		 //The method ConstructorClass() is undefined for the type ConstructorClass
		 // cc.ConstructorClass();
		 System.out.println(cc.getName());//���� 
		 System.out.println(cc.getAge());// 20
		 
		 ConstructorClass cc1 = new ConstructorClass();
	 }
}
