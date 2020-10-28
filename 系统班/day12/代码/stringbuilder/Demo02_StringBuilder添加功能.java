package com.ujiuye.stringbuilder;

public class Demo02_StringBuilder添加功能 {

	public static void main(String[] args) {
         //1. 创建出一个StringBuilder字符串缓冲区
		 StringBuilder sb = new StringBuilder();
		 // 1) append : 末尾添加数据
		 sb.append(true);
		 sb.append(3.14).append('z').append(new Object());
		 System.out.println(sb);
		 
		 // 2) insert : 指定索引位置添加数据
		 sb.insert(3, "添加");
		 System.out.println(sb);//tru添加e3.14zjava.lang.Object@15db9742
		 
		 // 3) length : 获取缓冲区中的字符个数
		 System.out.println(sb.length());// 36
		 sb.insert(sb.length(), "end");
		 System.out.println(sb);
		 
		 // 4) 获取缓冲区的容量
		 System.out.println(sb.capacity());// 70
	}
}
