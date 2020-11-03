package com.ujiuye.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01_FileInputStream {

	// 可以随时查看类型之间的继承关系 : 把鼠标定位在类型上, ctrl + T可以查看这个类型的继承关系
	public static void main(String[] args) throws IOException{
         // 1. 创建出一个字节输入流, 相当于绑定一个数据源
		 FileInputStream fis = new FileInputStream("D:\\aabbc.txt");
		 // 注意 : IO流资源只能操作文件, 不能操作文件夹
		 // FileInputStream fis1 = new FileInputStream(new File("D:\\1012系统班"));
	     /*int first = fis.read();
	     int second = fis.read();
	     int thrid = fis.read();
	     int four = fis.read();
	     int five = fis.read();
	     int six = fis.read();
		 System.out.println(first);// 97
		 System.out.println(second);// 98
		 System.out.println(thrid);// 99
		 System.out.println(four);// 33
		 System.out.println(five);// -1
		 System.out.println(six);// -1
    */		 
		 // len表示每次读取到的字节数据
		 int len;
		 while((len = fis.read()) != -1) {
			 System.out.print((char)len);
		 }
		 
		 // 一定要关闭资源
		 fis.close();
	}
}
