package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04_PictureCopy {

	public static void main(String[] args) throws IOException{
       // 1. 创建出一个字节输入流, 绑定一个数据源
	   FileInputStream fis = new FileInputStream("D:\\1012系统班\\day02\\图解\\变量定义和赋值过程.png");
	   // 2.  创建出一个字节输出流, 绑定一个数据目的
	   FileOutputStream fos = new FileOutputStream("D:\\变量定义copy2.png");
	   
	   // 3. 单个字节复制
	   // len表示每次读取到的字节数据结果
	   /*int len;
	   while((len = fis.read()) != -1) {
		   fos.write(len);
	   }*/
	   
	   // 4. 使用字节数组读写文件, 提高效率
	   byte[] b = new byte[1024*4];
	   // len表示读取到的字节的个数
	   int len;
	   while((len = fis.read(b)) != -1) {
		   fos.write(b, 0, len);
	   }
	   
	   fos.close();
	   fis.close();
	}
}
