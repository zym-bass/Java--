package com.ujiuye.staticdemo;

public class TestStudentStatic {
	public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s);
         //The static field Student.schoolName should be accessed in a static way
         System.out.println(s.schoolName);// һ��
         s.schoolName = "��һ��ѧ";
         System.out.println(s.schoolName);// ��һ��ѧ
         
         Student s1 = new Student();
         System.out.println(s1);
         System.out.println(s1.schoolName);// ��һ��ѧ
         
         // ���� : ��̬���÷�ʽ : ����.ֱ�ӵ���
         Student.schoolName = "����";
         System.out.println(Student.schoolName);
	}

}
