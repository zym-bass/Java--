package com.ujiuye.functioninterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo04_Predicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(105);
		list.add(99);
		list.add(86);
		list.add(7);
		list.add(120);
		// �ͻ�1 : ɸѡ������������С��100��ż��
		Predicate<Integer> pre = x->x < 100 && x % 2 == 0;
		System.out.println(testPredicate(list,pre));
		
		// �ͻ�2 : ɸѡ�����������е�����
		Predicate<Integer> pre1 = x->x % 2 != 0;
		System.out.println(testPredicate(list,pre1));
		
		// �ͻ�3 : ɸѡ�����������д���50����
		Predicate<Integer> pre2 = x->x > 50;
		System.out.println(testPredicate(list,pre2));
	}
	
	/*���� : ���ܵ�����ɸѡ����; �ͻ��ṩһ��ArrayList<Integer>����,
	���ݿͻ���Ҫ��, �������з�������������ɸѡ����, 
	���õ�һ���µ�ArrayList<Integer>�������ͻ�, ɸѡ�����ɿͻ�����
	�ͻ�1 : ɸѡ������������С��100��ż��
	�ͻ�2 : ɸѡ�����������е�����
	�ͻ�3 : ɸѡ�����������д���50����
	...
	
	*   ���� : 
	*    1) ��һ������ : ��Ҫ�ͻ��ṩԭʼ��ɸѡ���� ArrayList<Integer>
	*    2) �ڶ������� : ��Ҫ��֤Ԫ���Ƿ���������Ĺ���(˼��),��Predicate��Ϊ��������,
	*    Ϊ�˴���test��������, boolean test(Integer)
	*/
	public static ArrayList<Integer> testPredicate(ArrayList<Integer> list,Predicate<Integer> pre){
		ArrayList<Integer> newList = new  ArrayList<>();
		// ������ɸѡ�ļ���, ��ȡ�������е�ÿһ��Ԫ��
		for(int index = 0; index < list.size(); index++) {
			int ele = list.get(index);
			if(pre.test(ele)) {
				newList.add(ele);
			}
		}
		return newList;
	}
}
