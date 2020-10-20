package com.ujiuye.constructor;

public class TestStudentStatic {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);// 一中
		Student.schoolName="二中";
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.schoolName);// 二中
		s.schoolName = "第一中学";
		System.out.println(Student.schoolName);// 第一中学

		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(Student.schoolName);// 第一中学
		}
}
