package com.ujiuye.fanxing;

import java.util.ArrayList;

public class Demo02_����ͨ��� {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        
        // list2�����д洢����ʲô�������ݶ�����
        // containsAll(Collection<?> c) 
        System.out.println(list.containsAll(list2));// fasle
        
        // ? extends E : E��ʾ�������ü��ϵķ�������, ?��ʾ������Ҫ�ṩ�ķ�������
        // Ҫ�� : �ṩ�����ͱ�����E���ͱ��������E���͵���������
        // addAll(Collection<? extends E> c) 
        // list.addAll(list2);
	}

}
