package com.ujiuye.regex;

public class Demo01_预定义字符类 {

	public static void main(String[] args) {
		// 1. 匹配任意一个字符
        String regex = ".";
        System.out.println("7".matches(regex));// true
        System.out.println(">".matches(regex));// true
        System.out.println("家".matches(regex));// true
        
        // 2. \d : [0-9]
        String regex1 = "\\d";
        System.out.println("9".matches(regex1));// true
        System.out.println("a".matches(regex1));// false
        
        System.out.println("-----------");
        
        // 3. \D : [^0-9]
        String regex2 = "\\D";
        System.out.println("a".matches(regex2));// true
        System.out.println(" ".matches(regex2));// true
        System.out.println("8".matches(regex2));// false
        
        // 4. \s : 一个空格
        String regex3 = "\\s";
        System.out.println(" ".matches(regex3));// true
        System.out.println("  ".matches(regex3));// false
        System.out.println("0".matches(regex3));// false
        
        // 5. \S : 只要不是空格
        String regex4 = "\\S";
        System.out.println(" ".matches(regex4));//false
        System.out.println("".matches(regex4));// false
        System.out.println("k".matches(regex4));// true
        
        System.out.println("-----------------");
        
        // 6. \w : 单词字符：[a-zA-Z_0-9]
        String regex5 = "\\w";
        System.out.println("Y".matches(regex5));//true
        System.out.println("(".matches(regex5));//false
        
        
        // 7. \W : 单词字符：[^a-zA-Z_0-9]
        String regex6 = "\\W";
        System.out.println("_".matches(regex6));// false
        
	}

}
