package com.ujiuye.homework14;

import java.util.HashSet;
import java.util.Iterator;

public class Homework2 {
	/*2. ��֪������һ�����룬�����Ϊ11λ�����Ϊ5λ
	String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}��
	�����������������qq�Ŷ�����ں��ʵļ����У��ظ�QQ�Ų��洢��
	������������Ԫ��ʹ�õ�������forѭ�����ֱ�����ʽ��ӡ������*/
	public static void main(String[] args) {
		String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
		HashSet<String> tel = new HashSet<>();
		// 1. ����strs����, ��ȡ��ÿһ���ַ�������
		for(String no : strs) {
			// 2. ��ÿһ������洢��set������
			tel.add(no);
		}
		
		// 3. ����tel����
		Iterator<String> it = tel.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		for(String s : tel) {
			System.out.println(s + "----");
		}
	}
}
