package com.ujiuye.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo03_�����޸��쳣 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("hello");
		list.add("123abc");
		// addEle(list);
		addEle3(list);
	}
	
	// 2. ��������޸��쳣�ڶ��ַ���:
	public static void addEle3(List list) {
		// ����+get������������list
		for(int index = 0; index < list.size();index++) {
			String s = (String)list.get(index);
			if("hello".equals(s)) {
				list.add("world");
			}
		}
		System.out.println(list);
	}
	
	
	// 1. ��������޸��쳣��һ�ַ���:
	public static void addEle2(List list) {
		// 1) list�������е����� : listIterator()
		ListIterator it = list.listIterator();
		// 2) ��������list�е�Ԫ��
		while(it.hasNext()) {
			String s = (String)it.next();
			if("hello".equals(s)) {
				it.add("world");
			}
		}
		
		System.out.println(list);
	}
	
	/*����: �����һ������, �����д洢�ַ�������, �������ϵ�ͬʱ, ��֤, 
	��������д���Ԫ��hello, �򼯺������Ԫ��world
	  ���������޸��쳣����
	*/
	public static void addEle(List list) {
		// �����п���ʹ��list����
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if("hello".equals(s)) {
				list.add("world");
			}
		}
		System.out.println(list);
	}
}
