package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03_Map�ڶ��ֱ���EntrySet {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(2, "b");
        map.put(1, "a");
        map.put(3, "c");
        map.put(88, "world");
        
        // 1. ��ȡ��Map�����е����м�ֵ������
        Set<Map.Entry<Integer, String>> set= map.entrySet();
        // 2. ����set����, ��ȡ��ÿһ�Լ�ֵ�Թ�ϵ
        for(Map.Entry<Integer, String> entry : set) {
        	// 3. ��ȡ��һ��entry�е�ÿһ��key��value
        	Integer key = entry.getKey();
        	String value = entry.getValue();
        	System.out.println(key + "---" + value);
        }
	}

}
