package com.ujiuye.homework17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {

		/*1 .����һ�ļ�student.txt,�������£�
		����
		20
		����
		18
		����
		19
		
		1.���ļ��е�����ͨ�����ʵ�����������ӡ������̨
		2.��дStudent�࣬����name��age��������, �����ļ��ж�ȡ�����������������ݴ洢��Student������
		3.��Student����洢�������У���������������,��ӡ������ѧ����������������Ϣ*/
	public static void main(String[] args) throws IOException{
        // 1. ������һ���ַ���Ч������
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		// list�������ڴ洢���ļ��ض�ȡ����Student���Ͷ���
		ArrayList<Student> list = new ArrayList<>();
		// s��ʾ��ȡ����һ������
		String s;
		while((s = br.readLine()) != null) {
			// ��ѭ�����ڴ˶�ȡһ���ļ�����, ��ȡ��ѧ����������
			int age = Integer.parseInt(br.readLine());
			// ����ȡ��������������ͬ����һ��ѧ��������
			Student stu = new Student(s,age);
			// ��ѧ��������ӵ�������
			list.add(stu);
			System.out.println(s);
			System.out.println(age);
		}
		
		// ����������list����
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student ss = it.next();
			System.out.println(ss.getName() + "--" + ss.getAge());
		}
		
		br.close();
	}
}
