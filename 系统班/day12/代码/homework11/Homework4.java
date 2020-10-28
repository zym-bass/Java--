package com.ujiuye.homework11;

public class Homework4 {

//   4. 找出字符串"o"在字符串HelloWorld中,每次出现的索引位置
	public static void main(String[] args) {
         String s = "HelloWorld";
         char[] ch = s.toCharArray();
         for(int index = 0; index < ch.length; index++) {
        	 char c = ch[index];
        	 String cc = String.valueOf(c);
        	 if("o".equals(cc)) {
        		 System.out.println(index);
        	 }
         }
	}
}
