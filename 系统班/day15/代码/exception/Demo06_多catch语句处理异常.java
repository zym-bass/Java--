package com.ujiuye.exception;

import java.io.FileNotFoundException;

public class Demo06_��catch��䴦���쳣 {

	public static void main(String[] args) {
		String file = "cc.txt";
		try {
			checkFile(file);
		}catch(FileNotFoundException ex) {
			file = "abc.txt";
			System.out.println("��file����������Ĭ���ļ�ƥ�� : abc.txt");
		}catch(Exception ex) {
			file = "123.txt";
			System.out.println("��file����������Ĭ���ļ�ƥ�� : 123.txt");
		}
		
		
		/* ������Ĳ���ʽ
		 * try {
			checkFile(file);
		}catch(Exception ex) {// Exception ex = new FileNotFoundException("�ṩ�ļ�����Ŀ���ļ�abc.txt");
			file = "123.txt";
			System.out.println("��file����������Ĭ���ļ�ƥ�� : 123.txt");
		}catch(FileNotFoundException ex) { // �޷��ִ�Ĵ���,����
			file = "abc.txt";
			System.out.println("��file����������Ĭ���ļ�ƥ�� : abc.txt");
		}*/
		
		try {
			checkFile(file);
		}catch(Exception ex) {// Exception ex = new FileNotFoundException("�ṩ�ļ�����Ŀ���ļ�abc.txt");
			file = "123.txt";
			System.out.println("��file����������Ĭ���ļ�ƥ�� : 123.txt");
		}
		
		System.out.println("game over");
	}
	
	    // �����һ���������� : ���Ƿ����ƥ���ļ� abc.txt
		// Ŀǰ�����checkFile�������� : �쳣�Ѿ�����������
		public static void checkFile(String file) throws FileNotFoundException,Exception{
			 if(file == null) {
				 // NullPointerException ����ʱ���쳣, ��������Ҫ���д���
				 // throw new NullPointerException("�ṩ���ļ�����null");
				 throw new Exception("�ṩ���ļ�����null");
			 }
			 
			 if(!"abc.txt".equals(file)) {
				 //Unhandled exception type FileNotFoundException
				 throw new FileNotFoundException("�ṩ�ļ�����Ŀ���ļ�abc.txt");
			 }
			 
			 System.out.println(file);
		}

}
