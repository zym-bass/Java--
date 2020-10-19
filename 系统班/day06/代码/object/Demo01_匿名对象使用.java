package com.ujiuye.object;

public class Demo01_匿名对象使用 {

	public static void main(String[] args) {
		
		 // 匿名对象
         int age = new Person().age;
         System.out.println(age);// 0
         
         new Person().eat();// null正在吃饭
	}
}
