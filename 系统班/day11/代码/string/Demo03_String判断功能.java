package com.ujiuye.string;

public class Demo03_String判断功能 {

	public static void main(String[] args) {
        // 1.equals(Object obj) : 是从Object类中继承到的方法, String类重写, 使用方法调用者字符串与参数obj所表示的字符串进行内容的比较, 如果内容相同, 返回true, 否则返回false
		String s = "123";
		String s1 = new String("123");
		System.out.println(s == s1);// false
		System.out.println(s.equals(s1));// true
		
		String s2 = "Hello";
		String s3 = "hello";
		System.out.println(s2.equals(s3));// false
		
		// 2.equalsIgnoreCase(String str):让方法调用字符串与参数str进行内容比较, 忽略掉大小写之后, 内容如果相同, 返回true, 否则返回false
		System.out.println(s2.equalsIgnoreCase(s3));// true
		System.out.println("一".equalsIgnoreCase("壹"));// false
		
		// 3.startsWith(String str) : 验证方法调用字符串是否以参数字符串str为前缀开头(str可以从前往后匹配方法调用字符串), 
		// 如果是前缀返回true, 否则返回false
		String name = "张三";
		// 验证一个人的姓氏
		System.out.println(name.startsWith("张三"));// true
		
		// 4.endsWith(String str) : 验证方法调用字符串是否以参数字符串str为后缀(str可以从后往前匹配方法调用字符串), 如果是后缀返回true, 否则返回false
		String file = "abc.txt";
		System.out.println(file.endsWith(".txt"));//true
		
		// 5.contains(String s) : 验证方法调用字符串是否完全包含参数字符串s, 完全包含返回true, 否则返回false 
	    String s4 = "helloworld";
	    System.out.println(s4.contains("hello"));// true
	    System.out.println(s4.contains("llw"));// false
	    
	    // 6.isEmpty() : 验证方法调用字符串是否是一个空字符串, “”, 如果是空字符串返回true. 否则返回false, 在使用一个字符串之前, 可以利用isEmpty验证字符串中是否包含字符内容
	    System.out.println("".isEmpty());// true
	    System.out.println(" ".isEmpty());//false, " "1个空格也算作是一个字符
	}
}
