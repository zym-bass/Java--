package com.ujiuye.file;

import java.io.File;

public class Demo03_FileDeleteAndRename {

	public static void main(String[] args) {
          File f = new File("D:\\123.txt");
          // 1. ֱ��ɾ���ļ�, ����ļ���ʵ����, ɾ���ɹ�
          System.out.println(f.delete()); 
          
          File f1 = new File("D:\\a");
          // 2. ֱ��ɾ��һ���յ��ļ���, ɾ������
          System.out.println(f1.delete());
          
          File f2 = new File("D:\\create");
          // 3. ɾ���ǿ��ļ���, ɾ��ʧ��
          System.out.println(f2.delete());
          
          File f3 = new File("D:\\aa.txt");
          // 4. f3��·�������·��һ��, ֻ��ʾ�ļ�������
          f3.renameTo(new File("D:\\aabbc.txt"));
          File f4 = new File("D:\\bb.txt");
          
          // 5. f3��·�������·����һ�� , �Ƚ�f3��ʾ���ļ����е�Ŀ�����·����, ��������Ϊchange.txt
          f4.renameTo(new File("D:\\1012ϵͳ��\\change.txt"));
	}

}
