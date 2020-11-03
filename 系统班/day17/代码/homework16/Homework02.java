package com.ujiuye.homework16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Homework02 {
	/*2. 请从控制台反复输入字符串信息，程序将字符串信息存储到文件
	Info.txt(文件为当前项目工程根目录下的一个文件)中。
	当用户输入：”886”时，结束输入。*/
	public static void main(String[] args) throws IOException{
         File f = new File("Info.txt");
         if(!f.exists()) {
        	 f.createNewFile(); 
         }
         
         // 1. 创建出一个字节输出流, 绑定一个数据目的
         FileOutputStream fos = new FileOutputStream(f);
         Scanner sc = new Scanner(System.in);
         // 2. 设计一个while(true) 为了支持无限次输入数据
         System.out.println("请输入字符串, 同步到Info.txt文件中");
         while(true) {
        	 String s = sc.nextLine();
        	 // 3. 判断输入的s是否匹配886,结束循环
        	 if("886".equals(s)) {
        		 System.out.println("输入数据结束");
        		 break;
        	 }else {
        		 // 向文件中同步数据内容
        		 fos.write(s.getBytes());
        		 fos.write("\r\n".getBytes());
        	 }
         }
         
         fos.close();
	}
}
