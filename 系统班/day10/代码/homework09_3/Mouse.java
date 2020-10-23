package com.ujiuye.homework09_3;

public class Mouse implements USB {

	@Override
	public void openUSB() {
		System.out.println("鼠标开始使用USB");
	}

	@Override
	public void closeUSB() {
		System.out.println("鼠标使用USB结束");
	}

}
