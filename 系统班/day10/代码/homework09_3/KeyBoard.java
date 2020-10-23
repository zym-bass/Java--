package com.ujiuye.homework09_3;

public class KeyBoard implements USB {

	@Override
	public void openUSB() {
		System.out.println("键盘开始使用USB");
	}

	@Override
	public void closeUSB() {
		System.out.println("键盘使用USB结束");
	}

}
