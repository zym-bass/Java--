package com.ujiuye.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06_CopyMp4 {

	public static void main(String[] args) throws IOException{
		// 文件复制 : 使用高效缓冲流资源复制视频
		// 1. 创建出一个字节高效缓冲输入流, 绑定一个数据源
		FileInputStream bis = new FileInputStream(
				"D:\\1012系统班\\day01\\视频\\01.Java简介上.mp4");
		
		// 2. 创建出一个字节高效缓冲输出流, 绑定一个数据目的
		FileOutputStream fos = new FileOutputStream(
				"D:\\01.Java简介上Copy.mp4");
		
		long beginTime = System.currentTimeMillis();
		// len表示每次读取到字节数据
		int len;
		while((len = bis.read()) != -1) {
			fos.write(len);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-beginTime);
        fos.close();
        bis.close();
	}

}
