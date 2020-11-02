package com.ujiuye.exception;

import java.io.FileNotFoundException;

public class Demo06_多catch语句处理异常 {

	public static void main(String[] args) {
		String file = "cc.txt";
		try {
			checkFile(file);
		}catch(FileNotFoundException ex) {
			file = "abc.txt";
			System.out.println("给file类型设置了默认文件匹配 : abc.txt");
		}catch(Exception ex) {
			file = "123.txt";
			System.out.println("给file类型设置了默认文件匹配 : 123.txt");
		}
		
		
		/* 有问题的捕获方式
		 * try {
			checkFile(file);
		}catch(Exception ex) {// Exception ex = new FileNotFoundException("提供文件不是目标文件abc.txt");
			file = "123.txt";
			System.out.println("给file类型设置了默认文件匹配 : 123.txt");
		}catch(FileNotFoundException ex) { // 无法抵达的代码,报错
			file = "abc.txt";
			System.out.println("给file类型设置了默认文件匹配 : abc.txt");
		}*/
		
		try {
			checkFile(file);
		}catch(Exception ex) {// Exception ex = new FileNotFoundException("提供文件不是目标文件abc.txt");
			file = "123.txt";
			System.out.println("给file类型设置了默认文件匹配 : 123.txt");
		}
		
		System.out.println("game over");
	}
	
	    // 定义出一个方法功能 : 问是否可以匹配文件 abc.txt
		// 目前针对于checkFile方法功能 : 异常已经算作处理了
		public static void checkFile(String file) throws FileNotFoundException,Exception{
			 if(file == null) {
				 // NullPointerException 运行时期异常, 发生不需要进行处理
				 // throw new NullPointerException("提供的文件不能null");
				 throw new Exception("提供的文件不能null");
			 }
			 
			 if(!"abc.txt".equals(file)) {
				 //Unhandled exception type FileNotFoundException
				 throw new FileNotFoundException("提供文件不是目标文件abc.txt");
			 }
			 
			 System.out.println(file);
		}

}
