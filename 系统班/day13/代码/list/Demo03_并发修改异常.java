package com.ujiuye.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo03_并发修改异常 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("hello");
		list.add("123abc");
		// addEle(list);
		addEle3(list);
	}
	
	// 2. 解决并发修改异常第二种方案:
	public static void addEle3(List list) {
		// 索引+get方法遍历集合list
		for(int index = 0; index < list.size();index++) {
			String s = (String)list.get(index);
			if("hello".equals(s)) {
				list.add("world");
			}
		}
		System.out.println(list);
	}
	
	
	// 1. 解决并发修改异常第一种方案:
	public static void addEle2(List list) {
		// 1) list调用特有迭代器 : listIterator()
		ListIterator it = list.listIterator();
		// 2) 迭代集合list中的元素
		while(it.hasNext()) {
			String s = (String)it.next();
			if("hello".equals(s)) {
				it.add("world");
			}
		}
		
		System.out.println(list);
	}
	
	/*需求: 定义出一个集合, 集合中存储字符串数据, 遍历集合的同时, 验证, 
	如果集合中存在元素hello, 向集合中添加元素world
	  发生并发修改异常方法
	*/
	public static void addEle(List list) {
		// 方法中可以使用list集合
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if("hello".equals(s)) {
				list.add("world");
			}
		}
		System.out.println(list);
	}
}
