package com.ujiuye.file;

import java.io.File;

public class Demo04_FileCheckMethod {

	public static void main(String[] args) {
        File  f = new File("D:\\1012ϵͳ��\\change.txt");
        //1. exists() : ��֤FIle����ʾ�ļ������ļ����Ƿ���ʵ����, ������ڷ���true; ���򷵻�false;
        System.out.println(f.exists());// true
        System.out.println(new File("D:\\hello.java").exists());// false
        
        // 2. isFile() : ��֤File����ʾ���Ƿ���һ���ļ�, ������ļ�����true; ���򷵻�false;
        System.out.println(f.isFile());
        // 3. isDirectory() : ��֤File����ʾ���Ƿ���һ���ļ���, ������ļ�����true; ���򷵻�false;
        System.out.println(f.isDirectory());// false
	}
}
