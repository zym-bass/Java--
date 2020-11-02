package com.ujiuye.map;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03_Collections {

	public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(12);
         list.add(25);
         list.add(3);
         list.add(-8);
         list.add(12);
         
         // 1. sort(List list) : 将参数提供的list集合按照默认的升序进行排�?(从小到大)
         Collections.sort(list);
         System.out.println(list);//[-8, 3, 12, 12, 25]
         
         // 2)binarySearch(List<T> list, T key ): �?要list集合默认升序集合; 查找key值在list集合中出现的索引位置, 如果找了索引位返回大于等�?0整数结果; 否则返回负数
	     System.out.println(Collections.binarySearch(list, 12));// 2
	     System.out.println(Collections.binarySearch(list, 10));// -3
	
	     // 3)frequency(Collection<?> c, Object o) : 查找元素o在集合c中出现的次数, 返回int类型
	     System.out.println(Collections.frequency(list, 12));// 2
	     
	     // 4)max(Collection  c): 获取到集合中的最大�??
	     // 5)min(Collection  c): 获取到集合中的最小�??
	     System.out.println(Collections.max(list));// 25
	     System.out.println(Collections.min(list));// -8
	     
	     // 6)replaceAll(List<T> list, T old, T newObj): 将参数list集合中的�?有old元素替换成newObj元素
	     Collections.replaceAll(list, 12, 888);
	     System.out.println(list);//[-8, 3, 888, 888, 25]
	     
	     // 7)reverse(List list) : 将参数list集合进行逆序元素排列
	     Collections.reverse(list);
	     System.out.println(list);// [25, 888, 888, 3, -8]
	}
}
