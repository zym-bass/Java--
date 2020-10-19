package com.ujiuye.homeWork;

public class Test02 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("周老师");
		t.setAge(30);
		t.setContent("java面对对象");
		t.eat();
		t.teach();
		Student s = new Student();
		s.setName("韩学生");
		s.setAge(18);
		s.setContent("java面对对象");
		s.eat();
		s.teach();
	}

}
