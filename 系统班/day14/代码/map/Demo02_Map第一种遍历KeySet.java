package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02_Map��һ�ֱ���KeySet {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
         map.put(2, "b");
         map.put(1, "a");
         map.put(3, "c");
        // 1. ��ȡ��Map�����е�����Keyֵ
        Set<Integer> setKey = map.keySet();
        // 2. ����setKey��ȡ��ÿһ��key
        for(Integer key : setKey) {
        	// 3. ʹ��Map�е�get(key)
        	String value = map.get(key);
        	System.out.println(key + "---" + value);
        }
	}

}
