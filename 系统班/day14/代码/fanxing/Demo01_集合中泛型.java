package com.ujiuye.fanxing;

import java.util.ArrayList;

public class Demo01_�����з��� {

	public static void main(String[] args) {
        // 1. û�з���
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("abc");
		
		/*for(int index = 0; index < list.size(); index++) {
			// 1) ���� : ��Ҫ����ת��, ���鷳
			Object obj = list.get(index);
			// 2) ���� : �����д洢�˲�ͬ��������, ���»�ȡ����ת��ʱ, ����
			Integer i = (Integer)obj;
			System.out.println(i);
		}*/
		
		// 2. �з���
		// �����ڴ������϶���ʱ, ȷ������������
		// list1������ֻ�ܴ洢Integer��������
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(67);
		
		for(int index1 = 0; index1 < list1.size();index1++) {
			 Integer i = list1.get(index1);
			 System.out.println(i);
		}
	}
}
