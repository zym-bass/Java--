package com.ujiuye.duotai;

public class Teacher extends Person {
	@Override
	public void eat() {
		System.out.println("教师今天中想吃凉皮");
	}
	// 额外功能teach : 授课
	public void teach() {
		System.out.println("教师可以讲课");
	}
}
