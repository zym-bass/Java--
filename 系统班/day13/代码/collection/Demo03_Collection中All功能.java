package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_Collection中All功能 {
   public static void main(String[] args) {
	    Collection c = new ArrayList();
	    c.add("a");
	    c.add("b");
	    
	    Collection c1 = new ArrayList();
	    c1.add("1");
	    c1.add("2");
	    
	    // 1.addAll(Collection c): 将参数集合c中的所有元素, 都添加到方法调用集合中
	    c.addAll(c1);
	    System.out.println(c);//[a, b, 1, 2]
	    
	    // 2.removeAll(Collection c) : 将参数集合c中的所有元素都从方法调用集合中删除
	    c.removeAll(c1);
	    System.out.println(c);//[a, b]
	    
	    // 3.containsAll(Collection c): 验证方法调用集合中, 是否完全包含参数c中的所有元素,
	    // 如果完全包含返回true; 否则返回false
	    Collection c2 = new ArrayList();
	    c2.add("b");
	    System.out.println(c.containsAll(c2));// true
	    System.out.println(c.containsAll(c1));// false
	    
	    // 4. retainAll(Collection c) : 将方法调用集合与参数集合c中交集数据, 保留到方法调用集合中
	    // c--->[a,b]
	    // c2--->[b]
	    /*c.retainAll(c2);
	      System.out.println(c);//[b]
        */   
	    
	    // c--->[a,b]
	    // c1-->[1,2]
	    c.retainAll(c1);
        System.out.println(c);//[]
   }
}
