package com.ujiuye.file;

import java.io.File;
import java.io.IOException;

public class Demo02_FileAddMethod {

	public static void main(String[] args) throws IOException{
		
        File f = new File("D:\\123.txt");
        // createNewFile() : ��File��ʾ��һ���ļ�, �����ļ�·������, �ļ�������ʱ��, �˷����½���һ���յ��ļ�, 
        // ����ֵ����boolean����, �����ɹ�����true
        boolean boo = f.createNewFile();
        System.out.println(boo);
        
        File f1 = new File("D:\\a");
        // ÿ��ֻ�ܴ�����File������ʾ�����һ���ļ���, ������һ���ļ��и�·��������,
        // ����ʧ��,����ֵ����boolean����, �����ɹ�����true
        boolean boo1 = f1.mkdir();
        System.out.println(boo1);
        
        File f2 = new File("D:\\create\\file\\day01");
        // mkdirs() : ÿ�ο��Դ���һ�����߶༶�ļ���·��, ����ֵ����boolean����, �����ɹ�����true
        boolean boo2 = f2.mkdirs();
        System.out.println(boo2);
	}

}
