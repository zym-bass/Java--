package com.ujiuye.constructor;

public class ConstructorClass {
	
	private String name ;
	private int age ;
	
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
	
	public ConstructorClass() {
		name = "李四";
		age  =20 ;
		System.out.println(name+"..."+age);
	}
	public ConstructorClass(String name, int age ) {
		this.name = name;
		this.age = age;
		System.out.println(this.name+"..."+this.age);
	}
	
	
	public static void main(String[] args) {
		//调用无参构造
		ConstructorClass c = new ConstructorClass();
		//c.ConstructorClass();
		System.out.println(c.getAge());
		
		ConstructorClass c1 = new ConstructorClass("ewfw",123);
		System.out.println(c1.getAge());
	}
}
