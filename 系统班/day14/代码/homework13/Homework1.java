package com.ujiuye.homework13;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {
	/*1 .分析以下需求，并用代码实现：
	(1)定义List集合，存入多个字符串，其中包含三个连续的"def"
	(2)删除集合中所有"def"字符串
	(3)然后利用迭代器遍历集合元素并输出*/
	public static void main(String[] args) {
         ArrayList list = new ArrayList();
         list.add("abc");
         list.add("hello");
         list.add("def");
         list.add("def");
         list.add("def");
         list.add("end");
         
         // 删除 : remove  removeAll(Collection c)
         // list.remove("def");
         // 实现方式1 : 
         /*ArrayList list1 = new ArrayList();
         list1.add("def");
         
         // 1. 删除集合中的所有def字符串
         list.removeAll(list1);
         System.out.println(list);
         // 2. 使用迭代器遍历list集合中元素
         Iterator it = list.iterator();
         while(it.hasNext()) {
        	 Object obj = it.next();
        	 System.out.println(obj);
         }*/
         
         // 实现方式2 : 遍历同时删除集合元素
         Iterator it = list.iterator();
         while(it.hasNext()) {
        	 Object obj = it.next();
        	 String s = (String)obj;
        	 if("def".equals(s)) {
        		 it.remove();
        	 }
         }
         
         System.out.println(list);
	}
}
