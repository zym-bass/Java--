package com.ujiuye.homework11;

public class Homework3 {
	/*3.分析以下需求，并用代码实现
	(1)定义字符串Hello12345World
	            hELLO*****wORLD
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替
			举例:
				输出结果：hELLO*****wORLD
				
				*
				*  分析:
				*   1) 需要获取到字符串中的每一个字符, 才能知道这个字符是大小, 小写, 还是其他
				*      toCharArray()---> char[] --->遍历数组获取到字符串中的每一个字符
				*   2) 获取到每一个字符, 判断这个字符是什么?
				*      大写字母 :  c >= 65  && c <= 90;  c >= 'A' && c <= 'Z'  toLowerCase()
				*      小写字母 
				*      其他
				*
				*/
	public static void main(String[] args) {
        // 1. 定义出一个字符串
		String s = "Hello12345World";
		// 2. 将字符串转换成字符数组
		char[] ch = s.toCharArray();
		// 定义出一个最终结果字符串
		String endStr = "";
		// 3.遍历ch数组, 获取到字符串中的每一个字符
		for(int index = 0; index < ch.length; index++) {
			// c表示字符串中的每一个字符
			char c = ch[index];
			// 4. 验证字符c是什么范围
			if(c >= 'A' && c <= 'Z') {// c是大写字母, 变成小写(toLowerCase()--->String)
				// 5. 将字符c转换成字符串类型
				endStr = endStr + String.valueOf(c).toLowerCase();// h
			}else if(c >= 'a' && c <= 'z') {// c是小写字母, 变成大写
				endStr = endStr + String.valueOf(c).toUpperCase(); // E
			}else {
				endStr = endStr + "*";
			}
		}
		System.out.println(endStr);
	}
}
