package com.ujiuye.fanxing;

import java.util.ArrayList;

public class FanXingClass<T> {
	
	 int i = 10;

	 ArrayList<T> list = new ArrayList<>();
	 
	 public void addEle(T t) {
		 list.add(t);
		 System.out.println(list);
	 }
	
}
