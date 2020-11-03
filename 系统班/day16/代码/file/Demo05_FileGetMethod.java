package com.ujiuye.file;

import java.io.File;
import java.util.Arrays;

public class Demo05_FileGetMethod {

	public static void main(String[] args) {
         File f = new File("D:\\aabbc.txt");
         // 1.getAbsolutePath() : 将File类型所表示的文件或者文件夹的绝对路径以字符串的形式进行返回
         String path = f.getAbsolutePath();
         System.out.println(path);//  D:\aabbc.txt
         
         File f1 = new File("123.txt");
         System.out.println(f1.getAbsolutePath());// D:\workspace\day16\123.txt
         
         // 2.getPath() : 将File类型所封装的文件或者文件夹路径以字符串的形式进行返回
         System.out.println(f.getPath()); // D:\aabbc.txt
         System.out.println(f1.getPath());// 123.txt
         
         // 3.getName() : 将File类型所封装的文件或者文件夹路径最后一个部分的名字获取到, 返回String类型名字结果
         System.out.println(f.getName());// aabbc.txt
         
         File f2 = new File("D:\\1012系统班\\day01\\笔记");
         System.out.println(f2.getName());//笔记
         
         // 4.length() : 表示获取File所表示的文件的长度(文件的大小), 以字节为丈量粒度
         System.out.println(f.length());// 10
         
         // 5. list() : 将File所表示的文件夹路径下, 所有的子级别(当前文件夹级别下)的文件和文件夹都获取到,
         // 将获取到结果放置到String[]中
         String[] arr = f2.list();
         System.out.println(Arrays.toString(arr));
         
         // 6.listFiles() : 将File所表示的文件夹路径下, 所有的子级别(当前文件夹级别下)的文件和文件夹都获取到,
         // 将获取到结果放置到File[]中
         System.out.println(Arrays.toString(f2.listFiles()));
         
         File f3 = new File("D:\\1012系统班");
         System.out.println(Arrays.toString(f3.list()));
	}
}
