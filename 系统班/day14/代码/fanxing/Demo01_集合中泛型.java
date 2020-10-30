package com.ujiuye.fanxing;

import java.util.ArrayList;

public class Demo01_集合中泛型 {

	public static void main(String[] args) {
        // 1. 没有泛型
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("abc");
		
		/*for(int index = 0; index < list.size(); index++) {
			// 1) 问题 : 需要向下转型, 很麻烦
			Object obj = list.get(index);
			// 2) 问题 : 集合中存储了不同引用类型, 导致获取数据转型时, 报错
			Integer i = (Integer)obj;
			System.out.println(i);
		}*/
		
		// 2. 有泛型
		// 泛型在创建集合对象时, 确定出具体类型
		// list1集合中只能存储Integer类型数据
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(67);
		
		for(int index1 = 0; index1 < list1.size();index1++) {
			 Integer i = list1.get(index1);
			 System.out.println(i);
		}
	}
}
