package com.ujiuye.homework09_3;

public class MacBox {
	
	// 定义出笔记本开机功能
	public void openBox() {
		System.out.println("笔记本开机");
	}
	
	// 定义出笔记本关机功能
	public void closeBox() {
		System.out.println("笔记本关机");
	}
	
	// 定义出一个使用USB的功能
	// USB u = new Mouse(); // 接口的多态性
	// u.调用方法全部都是等号右边Mouse中重写方法
	// USB u1 = new KeyBoard();
	// u1.调用方法全部都是等号右边KeyBoard中重写方法
	public void useUSB(USB u) {// 键盘可以使用USB / 鼠标也可以使用USB...未来可以有很多设备使用USB
		u.openUSB();
		u.closeUSB();
	}
}
