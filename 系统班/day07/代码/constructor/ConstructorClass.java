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
	  * 修饰符 构造方法名(参数列表){
	           方法体;// 主要就是给对象中的成员变量进行赋值操作
	   }
	 */
	 public ConstructorClass() {
		 name = "李四";
		 age = 20;
		 System.out.println(name + "---" + age);
		 // return;
	 }
	 
	 public static void main(String[] args) {
		 // 调用空参数构造方法
		 ConstructorClass cc = new ConstructorClass();
		 //The method ConstructorClass() is undefined for the type ConstructorClass
		 // cc.ConstructorClass();
		 System.out.println(cc.getName());//李四 
		 System.out.println(cc.getAge());// 20
		 
		 ConstructorClass cc1 = new ConstructorClass();
	 }
}
