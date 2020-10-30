package com.ujiuye.set;

import java.util.HashSet;
import java.util.Set;

public class SetDefine {

	public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("a");
        set.add("world");
        set.add("a");
        set.add("hello");
        
        System.out.println(set);
	}
}
