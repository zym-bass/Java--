package com.ujiuye.innerclass;

public class Body {// 外部类
	// blood变量表示血压
	// private当前类中使用, 除了Body之外的其他外类中不能直接访问
	int blood = 120;
	
	// 普通成员内部类
	class Heart{// 心脏, 理解成一个成员变量
		int jump = 80;
		
		public void show() {
			System.out.println("血压为" + blood + ",心跳为:" + jump);
		}
	}
	
	// 定义出一个方法功能 : 使用普通成员内部类Heart中内容
	public void useHeart() {
		System.out.println(blood);// 120
		Heart h = new Heart();
		System.out.println(h.jump);// 80
		h.show();
	}

}
