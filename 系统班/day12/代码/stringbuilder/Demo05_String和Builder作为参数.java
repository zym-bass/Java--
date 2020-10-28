package com.ujiuye.stringbuilder;

public class Demo05_String和Builder作为参数 {
	
	
	public static void main(String[] args) {
		
	  String s = "123";
	  changeString(s);
	  System.out.println(s);// 123
	 
	 
	  StringBuilder sb = new StringBuilder("b");
	  changeBuilder(sb);
	  System.out.println(sb);// b
	}
	
	public static void changeBuilder(StringBuilder sb) {// 0x001
		sb = new StringBuilder("a");
	}
	
	/*public static void changeBuilder(StringBuilder sb) {
		sb.append("a");
	}*/
	
	public static void changeString(String s) {// s = 0x001
		s = s + "1";// s = 0x002
	}
}
