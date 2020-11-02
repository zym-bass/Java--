package com.ujiuye.homework14;

import java.util.HashSet;
import java.util.Iterator;

public class Homework2 {
	/*2. 已知数组存放一批号码，号码最长为11位，最短为5位
	String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
	将该数组里面的所有qq号都存放在合适的集合中，重复QQ号不存储，
	将集合中所有元素使用迭代器和for循环两种遍历方式打印出来。*/
	public static void main(String[] args) {
		String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
		HashSet<String> tel = new HashSet<>();
		// 1. 遍历strs数组, 获取到每一个字符串号码
		for(String no : strs) {
			// 2. 将每一个号码存储到set集合中
			tel.add(no);
		}
		
		// 3. 遍历tel集合
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
