package com.ujiuye.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01_Set���ϱ������� {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();// 19 -8 12
		set.add(12);
		set.add(19);
		set.add(12);
		set.add(-8);
		bianLiSet4(set);
	}
	
	// 1. toArray() : ����ת�������
	public static void bianLiSet1(Set<Integer> set) {
		Object[] objArr = set.toArray();
		for(int index = 0; index < objArr.length; index++) {
			Integer i = (Integer)objArr[index];
			System.out.println(i);
		}
	}
	
	 // 2. toArray(T[]) : ����ת����
	public static void bianLiSet2(Set<Integer> set) { 
		Integer[] arr = new Integer[set.size()];
		set.toArray(arr);
		
		for(int index = 0; index < arr.length; index++) {
			Integer i = arr[index];
			System.out.println(i+"--");
		}
	}
	
	// 3. ����������
	public static void bianLiSet3(Set<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i + "~~~");
		}
	}
	
	// 4. forEach����
	public static void bianLiSet4(Set<Integer> set) {
		Set<Integer> set2 = new HashSet<>();
		for(Integer i : set) {
			System.out.println(i+">>");
			if(i == -8) {
				set2.add(888);
			}
		}
		set.addAll(set2);
		System.out.println(set);
	}
}
