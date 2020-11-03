package com.ujiuye.file;

import java.io.File;

public class Demo01_FileConstructor {

	public static void main(String[] args) {
	   String s = "D:\\1012系统班";
       File f = new File(s);
       System.out.println(f);// D:\1012系统班
       
       File f1 = new File(s,"day01");
       System.out.println(f1);// D:\1012系统班\day01
       
       File f2 = new File(f1, "笔记");
       System.out.println(f2);// D:\1012系统班\day01\笔记
	}

}
