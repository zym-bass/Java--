package com.ujiuye.exception;

public class Demo10_自定义异常 {

	public static void main(String[] args) {
		
		try {
			fun();
		} catch (MyException e) {
			e.printStackTrace();
			e.use();
		}
	}
	
	public static void fun() throws MyException {
		if(true) {
			throw new MyException("自定义异常类");
		}
	}

}
