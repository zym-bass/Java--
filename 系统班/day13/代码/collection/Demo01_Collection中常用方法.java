package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01_Collection中常用方法 {

	public static void main(String[] args) {
         Collection c = new ArrayList();
         // 1)add(Object obj) : 向集合中添加数据obj, 末尾追加
         c.add("abc");
         c.add("123");
         c.add("hello");
         
         System.out.println(c);//[abc, 123, hello]
         
         // 2)remove(Object obj) : 将参数obj从集合中删除
         c.remove("123");
         System.out.println(c);//[abc, hello]
         
         // 5)size(): 获取到集合中的元素个数, 返回值类型int
         System.out.println(c.size());// 2
         
         // 6)inEmpty():验证集合中的是否为空, 如果集合为空, 那么返回true; 如果集合不为空返回false
         System.out.println(c.isEmpty());// false
         
         // 3)clear() : 清空集合, 删除集合中的所有元素, 返回值类型void
         c.clear();
         System.out.println(c);//[]
         
         // 4)contains(Object obj) :  验证集合中是否包含元素obj, 包含返回true, 不包含返回false
         System.out.println(c.contains("abc"));//false
         
         // 5)size(): 获取到集合中的元素个数, 返回值类型int
         System.out.println(c.size());
         
         // 6)inEmpty():验证集合中的是否为空, 如果集合为空, 那么返回true; 如果集合不为空返回false
         System.out.println(c.isEmpty());// true

	}

}
