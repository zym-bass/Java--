package com.ujiuye.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02_LinkedHashMap {

	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(33, "123");
        map.put(11, "a");
        map.put(2, "b");
        map.put(9, "c");
        
        //{33=123, 2=b, 9=c, 11=a}
        System.out.println(map);
        
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(33, "123");
        map1.put(11, "a");
        map1.put(2, "b");
        map1.put(9, "c");
        
        // {33=123, 11=a, 2=b, 9=c}
        System.out.println(map1);
	}
}
