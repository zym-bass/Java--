package com.ujiuye.regex;

public class Demo02_数量词 {

	public static void main(String[] args) {
		/*举例 : 验证客户的电话号码 : 13566778899
	      要求 : 电话号码中全数字; 第一位必须是1; 
	      第二位必须是3-9之间的数值; 剩下可以是任意数字; 长度必须为11位;*/
		
		String telRegex = "[1][3-9]\\d{9}";
		System.out.println("13822223344".matches(telRegex));// true
		System.out.println("1382222334".matches(telRegex));// false
		System.out.println("43822223344".matches(telRegex));// false
		System.out.println("11822223344".matches(telRegex));// false
		System.out.println("138222233 4".matches(telRegex));// false
		
		System.out.println("-------------");
		
		/*举例 : 验证QQ号码注册 : 2345678
	                 要求 : 全数字; 第一位不能是0; 长度5-15位之间*/
		String qqRegex = "[1-9][0-9]{4,14}";
		System.out.println("962431796".matches(qqRegex));//true
		System.out.println("012345".matches(qqRegex));// false
		System.out.println("9624".matches(qqRegex));//false
		System.out.println("962431796a".matches(qqRegex));//false
		
	}

}
