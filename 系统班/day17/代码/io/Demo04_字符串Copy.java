package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04_字符串Copy {

	public static void main(String[] args) throws IOException{
         // 1. 创建出一个字符输入流, 读取文件 , 绑定一个数据源
		 FileReader fr = new FileReader("abc.txt");
		 // 2. 创建出一个字符输出流, 写入文件, 绑定一个数据目的
		 FileWriter fw = new FileWriter("abcCopy.txt");
		 // len表示每次读取到的字符的个数
		 int len;
		 char[] ch = new char[10];
		 while((len = fr.read(ch)) != -1) {
			 fw.write(ch, 0, len);
		 }
		 
		 fw.close();
		 fr.close();
	}
}
