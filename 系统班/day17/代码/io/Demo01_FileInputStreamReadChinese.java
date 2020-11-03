package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01_FileInputStreamReadChinese {

	public static void main(String[] args) throws IOException{
		 // 1. 绑定一个数据源
         FileInputStream fis = new FileInputStream("chinese.txt");
         // 2. 使用单个字节进行文件内容读取
         // len表示每次读取到的字节对应的数据结果
        /* int len;
         while((len = fis.read()) != -1) {
        	 System.out.print((char)len);
         }*/
         
         // 3. 使用字节数组读取文件内容
         byte[] b = new byte[2];
         // len表示每次读取到的字节的个数
         int len;
         while((len = fis.read(b)) != -1) {
        	 System.out.print(new String(b,0,len));
         }
         fis.close();
	}
}
