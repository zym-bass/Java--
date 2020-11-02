package com.ujiuye.exception;

public class Demo07_TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println(useI());// 20
		System.out.println("game over");
	}
	
	public static int useI() {
		try {
			int i = 10 / 0;
			return i;
		}catch(NullPointerException e) {
			int i = 10;
			System.out.println("0不能做除数, 设置默认值为10");
			return i;
		}finally {// 注意 : 尽量不要在finally中写完return语句, 代码太过固定
			int i = 20;
			System.out.println("我一定要运行");
			// return i;
		}
	} 
}
