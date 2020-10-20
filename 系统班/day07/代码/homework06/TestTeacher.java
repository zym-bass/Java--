package com.ujiuye.homework06;

public class TestTeacher {

	public static void main(String[] args) {
         Teacher t = new Teacher();
         t.setName("周");
         t.setAge(30);
         t.setContent("面向对象知识");
         
         t.eat();
         t.teach();
	}
}
