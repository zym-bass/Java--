package com.ujiuye.exception;

public class Demo10_�Զ����쳣 {

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
			throw new MyException("�Զ����쳣��");
		}
	}

}
