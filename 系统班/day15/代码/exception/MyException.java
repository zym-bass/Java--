package com.ujiuye.exception;

public class MyException extends Exception {
	public MyException() {
		
	}
	// ���ø����װ�쳣��Ϣ�ķ�������
	public MyException(String message) {
		super(message);
	}
	// ���Զ����쳣���п��������װ����, ����JDK�ṩ���쳣������û�е�
	public void use() {
		System.out.println("�ҿ��Խ������");
	}

}
