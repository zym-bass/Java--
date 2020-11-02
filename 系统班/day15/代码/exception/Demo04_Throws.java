package com.ujiuye.exception;

import java.io.FileNotFoundException;

public class Demo04_Throws {

	public static void main(String[] args) throws FileNotFoundException, Exception{
		String file = "abc.txt";
		// main���������˴����쳣���� : checkFile
		checkFile(file);
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
