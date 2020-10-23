package com.ujiuye.homework09_3;

public class TestMacBox {

	public static void main(String[] args) {
		MacBox mb = new MacBox();
		mb.openBox();
		// 使用USB设备
		/*public void useUSB(USB u) {
			u.openUSB();
			u.closeUSB();
		}*/
		// 鼠标使用USB设备
		USB u = new Mouse();
		mb.useUSB(u);
		
		// 键盘开始使用USB设备
		KeyBoard kb = new KeyBoard();
		mb.useUSB(kb);
		
		mb.closeBox();
	}
}
