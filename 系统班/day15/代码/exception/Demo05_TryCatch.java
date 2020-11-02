package com.ujiuye.exception;

public class Demo05_TryCatch {

	public static void main(String[] args) {
		try {// 可能会发生问题的代码
			int i = 10 / 0; // 第7行发生数学运算问题 : new ArithmeticException("/ by 0");
	        System.out.println(i);
	        
		}catch(ArithmeticException ex) {// ArithmeticException ex = new ArithmeticException("/ by 0");
			int i = 0;
			System.out.println("将i值设置为默认的0");
		}
		
		System.out.println("game over");
	}

}
