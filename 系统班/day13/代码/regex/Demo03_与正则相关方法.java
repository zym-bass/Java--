package com.ujiuye.regex;

import java.util.Arrays;

public class Demo03_与正则相关方法 {

	public static void main(String[] args) {
		String birthday = "1999-10-01";
		String regex = "[-]";
		// 2.split(String regex) : 将字符串按照指定regex规则进行拆分, 
		// 将拆分出的每一个字符串放置到String[]中, 返回值类型 String[]
		String[] ss = birthday.split(regex);
		System.out.println(Arrays.toString(ss));// [1999, 10, 01]
		
		String ip = "192.168.12.122"; 
		String regex1 = "\\.";// [.]
		String[] ipArr = ip.split(regex1);
		System.out.println(Arrays.toString(ipArr));// [192, 168, 12, 122] 
		
		// 3. replaceAll(String regex, String replacement) : 将字符串中所有满足regex规则的字符序列, 替换成replacement
		// 返回值结果为替换之后的字符串结果
		String s = "Hello123world44ab";
		String newStr = s.replaceAll("\\d{1,}", "*");
		System.out.println(newStr);// Hello*world*ab
	}
}
