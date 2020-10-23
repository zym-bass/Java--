package com.ujiuye.block;

public class qwe {

	public static void main(String[] args) {
		Person p = getInstance();// 方法调用
		p.eat();
	}

	static Person getInstance() {
		// 如何补全代码能在main中输出结果 “吃饭”
		return new Person();

	}

	static class Person {// 静态成员内部类
		public void eat() {
			System.out.println("吃饭");
		}
	}
}
