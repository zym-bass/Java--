package com.ujiuye.exception;

public class MyException extends Exception {
	public MyException() {
		
	}
	// 调用父类封装异常信息的方法即可
	public MyException(String message) {
		super(message);
	}
	// 在自定义异常类中可以随意封装方法, 这是JDK提供的异常类中所没有的
	public void use() {
		System.out.println("我可以解决问题");
	}

}
