package com.ujiuye.homework15;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {

/*2. ����ArrayList����,���10��String��������{"1","2","3","4","5","6","7","8","9","10"}
Ҫ�� : 
 1. ��2����λ�ò���Ԫ��"2ADD" 
 2. ��ȡ5����λ��Ԫ��
 3. ɾ��6����λ��Ԫ��
 4. �޸�7����λ��Ԫ��Ϊ"7Modify"

����4�������������,ʹ�õ�����������������*/
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		
		list.add(2, "2ADD");
		System.out.println(list.get(5));
		list.remove(6);
		list.set(7, "7Modify");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
