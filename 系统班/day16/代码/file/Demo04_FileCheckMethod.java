package com.ujiuye.file;

import java.io.File;

public class Demo04_FileCheckMethod {

	public static void main(String[] args) {
        File  f = new File("D:\\1012系统班\\change.txt");
        //1. exists() : 验证FIle所表示文件或者文件夹是否真实存在, 如果存在返回true; 否则返回false;
        System.out.println(f.exists());// true
        System.out.println(new File("D:\\hello.java").exists());// false
        
        // 2. isFile() : 验证File所表示的是否是一个文件, 如果是文件返回true; 否则返回false;
        System.out.println(f.isFile());
        // 3. isDirectory() : 验证File所表示的是否是一个文件夹, 如果是文件返回true; 否则返回false;
        System.out.println(f.isDirectory());// false
	}
}
