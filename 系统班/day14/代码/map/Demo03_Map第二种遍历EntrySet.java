package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03_Map第二种遍历EntrySet {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(2, "b");
        map.put(1, "a");
        map.put(3, "c");
        map.put(88, "world");
        
        // 1. 获取到Map集合中的所有键值对数据
        Set<Map.Entry<Integer, String>> set= map.entrySet();
        // 2. 遍历set集合, 获取到每一对键值对关系
        for(Map.Entry<Integer, String> entry : set) {
        	// 3. 获取到一对entry中的每一个key和value
        	Integer key = entry.getKey();
        	String value = entry.getValue();
        	System.out.println(key + "---" + value);
        }
	}

}
