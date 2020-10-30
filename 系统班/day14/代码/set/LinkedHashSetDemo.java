package com.ujiuye.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
           HashSet<Integer> set = new HashSet<>();
           set.add(88);
           set.add(6);
           set.add(16);
           set.add(6);
           
           System.out.println(set);
           
           LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
           set1.add(88);
           set1.add(6);
           set1.add(16);
           set1.add(6);
           
           System.out.println(set1);
	}
}
