package com.ujiuye.constructor;

public class TestStudentStatic {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);// һ��
		Student.schoolName="����";
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.schoolName);// ����
		s.schoolName = "��һ��ѧ";
		System.out.println(Student.schoolName);// ��һ��ѧ

		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(Student.schoolName);// ��һ��ѧ
		}
}
