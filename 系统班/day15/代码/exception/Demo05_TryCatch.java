package com.ujiuye.exception;

public class Demo05_TryCatch {

	public static void main(String[] args) {
		try {// ���ܻᷢ������Ĵ���
			int i = 10 / 0; // ��7�з�����ѧ�������� : new ArithmeticException("/ by 0");
	        System.out.println(i);
	        
		}catch(ArithmeticException ex) {// ArithmeticException ex = new ArithmeticException("/ by 0");
			int i = 0;
			System.out.println("��iֵ����ΪĬ�ϵ�0");
		}
		
		System.out.println("game over");
	}

}
