package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02_集合第一种遍历方式 {
    public static void main(String[] args) {
		// 1. 创建出一个集合容器
    	Collection c = new ArrayList();
    	// 基本数据类型利用自动拆装箱机制, 让基本类型直接封装成对应引用类型存储在集合中
    	c.add(15);
    	c.add(-8);
    	c.add(99);
    	
    	// 2. 使用toArray方法, 将集合转换成一个Object[]数组
    	Object[] objArr = c.toArray();
    	
    	for(int index = 0; index < objArr.length; index++) {
    		//Type mismatch: cannot convert from Object to Integer
    		Integer obj = (Integer)objArr[index];
    		System.out.println(obj);
    	}
	}
}
