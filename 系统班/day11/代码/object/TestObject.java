package com.ujiuye.object;

public class TestObject {

	public static void main(String[] args) {
		// 1. toString
		Person p = new Person();
		String result = p.toString();
		/*public String toString() {
		 *                       ���а�·�������ȫ��      �ָ���     ���������ڴ��е�ַת����16��������ʾ
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }*/
		System.out.println(result);//com.ujiuye.object.Person@15db9742
		
		System.out.println(p+"---");//com.ujiuye.object.Person@15db9742---
		
		// 2. equals
		Person p1 = new Person("����",20);
		Person p2 = new Person("����",20);
		System.out.println(p1.equals(p2));// Դ�����бȽ����������ڴ��ַ , false		
	}
}
