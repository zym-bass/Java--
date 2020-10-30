package com.ujiuye.fanxing;

import java.util.ArrayList;

public class Demo02_泛型通配符 {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        
        // list2集合中存储的是什么类型数据都可以
        // containsAll(Collection<?> c) 
        System.out.println(list.containsAll(list2));// fasle
        
        // ? extends E : E表示方法调用集合的泛型类型, ?表示参数需要提供的泛型类型
        // 要求 : 提供的类型必须是E类型本身或者是E类型的子类类型
        // addAll(Collection<? extends E> c) 
        // list.addAll(list2);
	}

}
