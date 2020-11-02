package com.ujiuye.homework14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {
	/*1. �����ַ���aaaabbccddd!@#@#$@#$%cc66ff, ͳ��ÿ���ַ����ֵĴ���,
	���ַ������Ӧ�������洢��Map������, �������ϵõ�����������
	    a��4����b��2����c��4����d��3����!��1����@��3����$��2����%��1����6��2����f��2��
	    
	    *
	    *  Map<Character,Integer>  map---> ���ڴ洢�ַ���������Ӧ��ϵ
	         *   ���� :
	    *   1. ��Ҫ��ȡ���ַ����е�ÿһ���ַ�, toCharArray()---->char[]
	    *   2. ����char[]����, ��ȡ��ÿһ���ַ�
	    *      map.put(�ַ�,?);
	    *          ����put��������ʹ�÷�ʽ : 
	    *       a : ��ӵ��ַ�a, �����map���ϵ�keyֵ�в�����, ֤���ַ���һ�����, ����Ϊ1
	    *       b : ��ӵ��ַ�a, �����map���ϵ�keyֵ�д���, ֤���ַ�a���ǵ�һ����ӵ�������,
	    *                             ��Ҫ��ȡ��a�ַ��ļ������map.get(�ַ�) + 1, �õ��µļ������
	    *       
	    *      map.put(a,����);
	    */
	public static void main(String[] args) {
         // 1.�����һ���ַ���
		 String s = "aaaabbccddd!@#@#$@#$%cc66ff";
		 // 2.map���ڴ洢�ַ���������Ӧ��ϵ
		 Map<Character, Integer> map = new HashMap<>();
		 // 3. �ַ���ת����һ���ַ�����
		 char[] ch = s.toCharArray();
		 // 4. ����ch����, ��ȡ��ÿһ���ַ�
		 for(char c : ch) {
			 // ��֤��ǰ���ַ�c��map�������Ƿ��ǵ�һ�δ洢
			 if(map.containsKey(c)) {// c�ַ����ǵ�һ�δ洢
				 // �Ȼ�ȡ��c�ַ�֮ǰ�Ĵ洢����, +1 �õ����¼�����
				 Integer value = map.get(c) + 1;
				 map.put(c, value);
			 }else {// c�ַ��ǵ�һ�δ洢
				 map.put(c, 1);
			 }
		 }
		 
		// 5. ����map����
		Set<Character> set = map.keySet();
		for(Character key : set) {
			Integer v = map.get(key);
			System.out.print(key + "��" + v + "��    ");
		}
	}
}
