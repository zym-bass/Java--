package com.ujiuye.file;

import java.io.File;
import java.util.Arrays;

public class Demo05_FileGetMethod {

	public static void main(String[] args) {
         File f = new File("D:\\aabbc.txt");
         // 1.getAbsolutePath() : ��File��������ʾ���ļ������ļ��еľ���·�����ַ�������ʽ���з���
         String path = f.getAbsolutePath();
         System.out.println(path);//  D:\aabbc.txt
         
         File f1 = new File("123.txt");
         System.out.println(f1.getAbsolutePath());// D:\workspace\day16\123.txt
         
         // 2.getPath() : ��File��������װ���ļ������ļ���·�����ַ�������ʽ���з���
         System.out.println(f.getPath()); // D:\aabbc.txt
         System.out.println(f1.getPath());// 123.txt
         
         // 3.getName() : ��File��������װ���ļ������ļ���·�����һ�����ֵ����ֻ�ȡ��, ����String�������ֽ��
         System.out.println(f.getName());// aabbc.txt
         
         File f2 = new File("D:\\1012ϵͳ��\\day01\\�ʼ�");
         System.out.println(f2.getName());//�ʼ�
         
         // 4.length() : ��ʾ��ȡFile����ʾ���ļ��ĳ���(�ļ��Ĵ�С), ���ֽ�Ϊ��������
         System.out.println(f.length());// 10
         
         // 5. list() : ��File����ʾ���ļ���·����, ���е��Ӽ���(��ǰ�ļ��м�����)���ļ����ļ��ж���ȡ��,
         // ����ȡ��������õ�String[]��
         String[] arr = f2.list();
         System.out.println(Arrays.toString(arr));
         
         // 6.listFiles() : ��File����ʾ���ļ���·����, ���е��Ӽ���(��ǰ�ļ��м�����)���ļ����ļ��ж���ȡ��,
         // ����ȡ��������õ�File[]��
         System.out.println(Arrays.toString(f2.listFiles()));
         
         File f3 = new File("D:\\1012ϵͳ��");
         System.out.println(Arrays.toString(f3.list()));
	}
}
