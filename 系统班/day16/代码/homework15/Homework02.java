package com.ujiuye.homework15;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {

/*2. 创建ArrayList集合,添加10个String类型数据{"1","2","3","4","5","6","7","8","9","10"}
要求 : 
 1. 在2索引位置插入元素"2ADD" 
 2. 获取5索引位置元素
 3. 删除6索引位置元素
 4. 修改7索引位置元素为"7Modify"

上述4个操作进行完毕,使用迭代器遍历集合内容*/
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		
		list.add(2, "2ADD");
		System.out.println(list.get(5));
		list.remove(6);
		list.set(7, "7Modify");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
