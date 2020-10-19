package com.ujiuye.object;

public class TestPerson {

	public static void main(String[] args) {
        // 1. 创建出一个人类(Person)对象
		// 类名    对象名 = new 类名();
		Person p = new Person();
		// 2. 给p人类对象进行成员变量赋值
		p.name = "张三";
		p.age = 20;
		p.sex = "男";
		
		// 3. 获取对象p中的成员变量的数据
		String name = p.name;
		System.out.println(name); 
		
		System.out.println(p.age);
		System.out.println(p.sex);
		
		// 4. 调用person类型中方法功能
		p.eat();
		p.sleep();
		p.work();
	}
}
