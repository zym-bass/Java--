package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04_集合迭代器遍历 {

	public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("ab");
        c.add("123");
        c.add("hello");
        
        // 1. 获取到集合c迭代器对象
        Iterator it = c.iterator();
        // 2. hasNext : 判断集合中是否还具有下一个元素数据, 如果有返回true, 如果没有返回false
        while(it.hasNext()) {
        	// 3. next() : 获取到集合中的下一个元素, 返回获取到元素结果, Object类型
        	Object obj = it.next();
        	String s = (String)obj;
        	System.out.println(s);
        }
        // NoSuchElementException
        System.out.println(it.next());
	}
}
