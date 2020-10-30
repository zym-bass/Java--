package com.ujiuye.homework13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Homework3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		LinkedList list1 = new LinkedList();
		addArrayList(list);// 9
		addLinkedList(list1);// 2
		getArrayList(list);// 2
		getLinkedList(list1);// 1
		removeArrayList(list);// 21
		removeLinkedList(list1);// 2
	}
	
	// 1. ����ArrayList��βԪ����ӹ���ִ��ʱ��
	public static void addArrayList(ArrayList list) {
		long beginTime = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++) {
			list.add(0, "a");
			list.add(list.size()-1,"end");
		}
	
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - beginTime);
	}
	
	   // 2. ����LinkedList��βԪ����ӹ���ִ��ʱ��
		public static void addLinkedList(LinkedList list) {
			long beginTime = System.currentTimeMillis();
			for(int i = 1; i <= 10000; i++) {
				list.addFirst("a");
				list.addLast("end");
			}
		
			long endTime = System.currentTimeMillis();
			System.out.println(endTime - beginTime);
		}
		
		// 3. ����ArrayList��βԪ�ػ�ȡ����ִ��ʱ��
		public static void getArrayList(ArrayList list) {
			long beginTime = System.currentTimeMillis();
			for(int i = 1; i <= 10000; i++) {
				list.get(0);
				list.add(list.size()-1);
			}
		
			long endTime = System.currentTimeMillis();
			System.out.println(endTime - beginTime);
		}
		
		// 4. ����LinkedList��βԪ�ػ�ȡ����ִ��ʱ��
				public static void getLinkedList(LinkedList list) {
					long beginTime = System.currentTimeMillis();
					for(int i = 1; i <= 10000; i++) {
						list.getFirst();
						list.getLast();
					}
					long endTime = System.currentTimeMillis();
					System.out.println(endTime - beginTime);
				}
				
				// 5. ����ArrayList��βԪ��ɾ������ִ��ʱ��
				public static void removeArrayList(ArrayList list) {
					long beginTime = System.currentTimeMillis();
					for(int i = 1; i <= 10000; i++) {
						list.remove(0);
						list.remove(list.size()-1);
					}
				
					long endTime = System.currentTimeMillis();
					System.out.println(endTime - beginTime);
				}
				
				// 6. ����LinkedList��βԪ��ɾ������ִ��ʱ��
				public static void removeLinkedList(LinkedList list) {
					long beginTime = System.currentTimeMillis();
					for(int i = 1; i <= 10000; i++) {
						list.removeFirst();
						list.removeLast();
					}
					long endTime = System.currentTimeMillis();
					System.out.println(endTime - beginTime);
				}
}
