package com.ujiuye.homework09_3;

public class TestMacBox {

	public static void main(String[] args) {
		MacBox mb = new MacBox();
		mb.openBox();
		// ʹ��USB�豸
		/*public void useUSB(USB u) {
			u.openUSB();
			u.closeUSB();
		}*/
		// ���ʹ��USB�豸
		USB u = new Mouse();
		mb.useUSB(u);
		
		// ���̿�ʼʹ��USB�豸
		KeyBoard kb = new KeyBoard();
		mb.useUSB(kb);
		
		mb.closeBox();
	}
}
