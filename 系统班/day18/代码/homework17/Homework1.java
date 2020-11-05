package com.ujiuye.homework17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {

		/*1 .现有一文件student.txt,内容如下：
		张三
		20
		李四
		18
		王五
		19
		
		1.将文件中的数据通过合适的流读出，打印到控制台
		2.编写Student类，具有name和age两个属性, 将从文件中读取到的姓名和年龄数据存储到Student对象中
		3.将Student对象存储到集合中，迭代器遍历集合,打印出所有学生的姓名和年龄信息*/
	public static void main(String[] args) throws IOException{
        // 1. 创建出一个字符高效缓冲流
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		// list集合用于存储从文件重读取出的Student类型对象
		ArrayList<Student> list = new ArrayList<>();
		// s表示读取到的一行内容
		String s;
		while((s = br.readLine()) != null) {
			// 在循环中在此读取一行文件内容, 获取到学生年龄数据
			int age = Integer.parseInt(br.readLine());
			// 将读取到的姓名和年龄同步到一个学生对象中
			Student stu = new Student(s,age);
			// 将学生对象添加到集合中
			list.add(stu);
			System.out.println(s);
			System.out.println(age);
		}
		
		// 迭代器遍历list集合
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student ss = it.next();
			System.out.println(ss.getName() + "--" + ss.getAge());
		}
		
		br.close();
	}
}
