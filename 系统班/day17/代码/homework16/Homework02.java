package com.ujiuye.homework16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Homework02 {
	/*2. ��ӿ���̨���������ַ�����Ϣ�������ַ�����Ϣ�洢���ļ�
	Info.txt(�ļ�Ϊ��ǰ��Ŀ���̸�Ŀ¼�µ�һ���ļ�)�С�
	���û����룺��886��ʱ���������롣*/
	public static void main(String[] args) throws IOException{
         File f = new File("Info.txt");
         if(!f.exists()) {
        	 f.createNewFile(); 
         }
         
         // 1. ������һ���ֽ������, ��һ������Ŀ��
         FileOutputStream fos = new FileOutputStream(f);
         Scanner sc = new Scanner(System.in);
         // 2. ���һ��while(true) Ϊ��֧�����޴���������
         System.out.println("�������ַ���, ͬ����Info.txt�ļ���");
         while(true) {
        	 String s = sc.nextLine();
        	 // 3. �ж������s�Ƿ�ƥ��886,����ѭ��
        	 if("886".equals(s)) {
        		 System.out.println("�������ݽ���");
        		 break;
        	 }else {
        		 // ���ļ���ͬ����������
        		 fos.write(s.getBytes());
        		 fos.write("\r\n".getBytes());
        	 }
         }
         
         fos.close();
	}
}
