package com.ujiuye.homework09_3;

public class KeyBoard implements USB {

	@Override
	public void openUSB() {
		System.out.println("���̿�ʼʹ��USB");
	}

	@Override
	public void closeUSB() {
		System.out.println("����ʹ��USB����");
	}

}
