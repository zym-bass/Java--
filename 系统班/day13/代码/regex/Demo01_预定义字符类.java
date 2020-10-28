package com.ujiuye.regex;

public class Demo01_Ԥ�����ַ��� {

	public static void main(String[] args) {
		// 1. ƥ������һ���ַ�
        String regex = ".";
        System.out.println("7".matches(regex));// true
        System.out.println(">".matches(regex));// true
        System.out.println("��".matches(regex));// true
        
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
        
        // 4. \s : һ���ո�
        String regex3 = "\\s";
        System.out.println(" ".matches(regex3));// true
        System.out.println("  ".matches(regex3));// false
        System.out.println("0".matches(regex3));// false
        
        // 5. \S : ֻҪ���ǿո�
        String regex4 = "\\S";
        System.out.println(" ".matches(regex4));//false
        System.out.println("".matches(regex4));// false
        System.out.println("k".matches(regex4));// true
        
        System.out.println("-----------------");
        
        // 6. \w : �����ַ���[a-zA-Z_0-9]
        String regex5 = "\\w";
        System.out.println("Y".matches(regex5));//true
        System.out.println("(".matches(regex5));//false
        
        
        // 7. \W : �����ַ���[^a-zA-Z_0-9]
        String regex6 = "\\W";
        System.out.println("_".matches(regex6));// false
        
	}

}
