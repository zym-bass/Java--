package com.ujiuye.staticdemo;

public class TestStudentStatic {
	public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s);
         //The static field Student.schoolName should be accessed in a static way
         System.out.println(s.schoolName);// 一中
         s.schoolName = "第一中学";
         System.out.println(s.schoolName);// 第一中学
         
         Student s1 = new Student();
         System.out.println(s1);
         System.out.println(s1.schoolName);// 第一中学
         
         // 补充 : 静态调用方式 : 类名.直接调用
         Student.schoolName = "二中";
         System.out.println(Student.schoolName);
	}

}
