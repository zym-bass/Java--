package com.ujiuye.string;

public class Demo04_String获取功能 {

	public static void main(String[] args) {
        //1.length() : 返回字符串中字符的个数(返回字符串长度), 返回值类型int类型
		System.out.println("".length());// 0
		System.out.println("  1".length());// 3
		// 2.charAt(int index) : 将字符串中指定index索引位置对应的字符获取到, 返回值char类型
		String s = "helloabc";
		char ch = s.charAt(3);
		System.out.println(ch);// l
		
		for(int index = 0; index < s.length(); index++) {
			System.out.print(s.charAt(index) + "  ");
		}
		
		System.out.println();
		
		//3.substring(int beginIndex) : 将方法调用字符串从beginIndex索引位置开始, 截取到剩下的全部, 返回截取出的新字符串
		String s1 = s.substring(5);
		System.out.println(s1);//abc
		
		// 4.substring(int beginIndex, int endIndex) : 将方法调用字符串从beginIndex索引位置开始,截取到endIndex-1结束, 中间截取到的字符串作为方法的返回值结果
		// 注意 : JDK提供方法功能中, 如果是同时在操作两个索引位, 通常包含起始索引而不包含结束索引
		String s2 = s.substring(1,6);//elloa
		System.out.println(s2);
		
		// 5.indexOf(String str): 获取参数字符串str在方法调用字符串中第一次出现的索引位置, 返回是int类型索引值结果; 如果没有找到目标的字符串str, 返回-1
		String name = "海盗船长";
		System.out.println(name.indexOf("123"));// -1
		System.out.println(name.indexOf("船长"));// 2
		
		// 6.indexOf(String str, int beginIndex) : 从beginIndex索引位置开始向后寻找, str第一次出现在方法调用字符串中的索引位置
	    System.out.println(name.indexOf("船长", 1));// 2
	}
}
