package com.ujiuye.exception;

import java.io.FileNotFoundException;

public class Demo04_Throws {

	public static void main(String[] args) throws FileNotFoundException, Exception{
		String file = "abc.txt";
		// main方法调用了带有异常功能 : checkFile
		checkFile(file);
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
