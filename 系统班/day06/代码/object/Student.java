package com.ujiuye.object;

public class Student {
	// 姓名
	String name;
	// 班级号
	String classNo;
	// 学号
	String id;
	// 年龄, 因为使用private修饰, age只能在Student类中使用, 其他所有外类不能直接使用和访问
	private int age;
	
	// Setter方法 : 给age私有成员变量提供对外的, 公共的访问age方式, 给age进行赋值
	public void setAge(int a) {
		if(a > 0) {
			age = a;
		}else {
		  System.out.println("提供的数据" + a 
			+ "不符合年龄数据, 默认年龄值为0");
		}
	}
	// Getter方法 : 给私有成员变量age提供对外公共的获取方式
	public int getAge() {
		return age;
	}
	
	public void study() {
		System.out.println("学生一直在努力的学习");
	}
}
