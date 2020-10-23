package com.ujiuye.other;

import com.ujiuye.quanxian.受保护权限Class;

public class TestQX {

	public static void main(String[] args) {
		// 1. 默认权限只能在本包中使用,外包无法使用
		// 默认权限Class c = new 默认权限Class();
		
		// 2. 创建出一个受保护类型的外包子类对象
		受保护子类 cl = new 受保护子类();
		// System.out.println(c1.pro);
		
		// 3. public修饰的类受保护权限Class可以在外包的无关类中使用, 
		// public只要是当前项目工程下, 都可以使用
		System.out.println(new 受保护权限Class());
	}
}
