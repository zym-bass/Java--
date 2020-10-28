package com.ujiuye.stringbuilder;

public class Demo04_StringBuilder替换和反转 {

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("helloworld");
		 //1.replace(int beginIndex, int endIndex, String str) : 从beginIndex索引位置开始到endIndex-1索引位置结束, 中间字符序列使用字符串str进行替换,返回当前正在操作的StringBuilder类型对象本身
		 sb.replace(1, 4, "替换");
		 System.out.println(sb); // h替换oworld
		 
		 // 2.reverse() : 将StringBuilder中的字符内容进行逆序排序,返回当前正在操作的StringBuilder类型对象本身
		 sb.reverse();
		 System.out.println(sb);
	}
}
