package com.ujiuye.homework09_3;

public class Mouse implements USB {

	@Override
	public void openUSB() {
		System.out.println("��꿪ʼʹ��USB");
	}

	@Override
	public void closeUSB() {
		System.out.println("���ʹ��USB����");
	}

}
