package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02_Map第一种遍历KeySet {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
         map.put(2, "b");
         map.put(1, "a");
         map.put(3, "c");
        // 1. 获取到Map集合中的所有Key值
        Set<Integer> setKey = map.keySet();
        // 2. 遍历setKey获取到每一个key
        for(Integer key : setKey) {
        	// 3. 使用Map中的get(key)
        	String value = map.get(key);
        	System.out.println(key + "---" + value);
        }
	}

}
