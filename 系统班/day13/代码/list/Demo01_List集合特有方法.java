package com.ujiuye.list;

import java.util.ArrayList;
import java.util.List;

public class Demo01_List集合特有方法 {

	public static void main(String[] args) {
        List list = new ArrayList();// list集合中的索引范围0-3
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        // 1.add(int index, Object obj) : 将元素obj添加到集合指定index索引位置上
        list.add(2,"first");
        System.out.println(list);// [a, b, first, c, d]
        
        // 2.remove(int index) : 删除index索引位置上的元素, 将删除元素的原值返回
        Object obj = list.remove(4);
        System.out.println(obj);// d
        System.out.println(list);// [a, b, first, c]
       
        // 3.set(int index, Object obj) : 将集合中指定的index索引位置上的元素替换成obj, 将被替换的元素原值作为返回值类型 
        Object obj1 = list.set(2, "modify");
        System.out.println(obj1);// first
        System.out.println(list);// [a, b, modify, c]
        
        // 4. get(int index) : 获取到集合中指定index索引位置上的元素, 返回值类型Object
        System.out.println(list.get(1));// b
        System.out.println(list.get(3));// c
	}
}
