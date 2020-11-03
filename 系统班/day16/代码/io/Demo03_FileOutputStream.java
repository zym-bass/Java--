package com.ujiuye.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_FileOutputStream {

	public static void main(String[] args) throws IOException{
		File f = new File("second.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
        // 1. 创建出一个字节输出流, 相当于绑定一个数据目的
		FileOutputStream fos = new FileOutputStream(f);
		//aABCDECD
		// 2. 向文件中写入数据
		// 1)write(int b) : 将字节数据b写入到文件中
		fos.write(97);// a
		fos.write(65);// A
		
		byte[] b = {66,67,68,69};
		// 2)write(byte[] b) : 将字节数组b中的所有内容写入到文件中
		fos.write(b);
		
		// 3)write(byte[] b, int index, int length) : 将数组b从index索引位置开始, 
		// 写入length个字节到文件中
		fos.write(b, 1, 2);// 67 68
		
		// getBytes() : 将字符串转成字节数组
		fos.write("你好".getBytes());
		
		// 记得关闭资源
		fos.close();
	}
}
