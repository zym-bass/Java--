package com.ujiuye.homework15;

public class Homework01 {
	/*1.分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
			第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数*/
	public static void main(String[] args) {
          // 1.定义出一个数组字符串数组
		  String[] arr = {"010","3223","666","7890987","123123"};
		  // count用于计算对称字符串的个数
		  int count = 0;
		  // 2. 获取到每一个字符串
		  for(String s : arr) {
			  // 3.将字符串转换成一个字符数组
			  char[] ch = s.toCharArray();
			  // flag表示当前字符串是否对称, true 表示对称, 否则不对称
			  boolean flag = true;
			  // 4. 遍历ch数组,验证对称性
			  for(int beginIndex = 0, endIndex = ch.length-1; 
					  beginIndex < endIndex; beginIndex++, endIndex--) {
				  if(ch[beginIndex] != ch[endIndex]) {// 前后对应索引位置的元素不一致, 证明不对称
					  flag = false;
					  break;
				  }
			  }
			  
			  // 5. 通过flag表示验证字符是否对称
			  if(flag) {
				  count++;
				  System.out.println(s);
			  }
		  }
		  
		  System.out.println("对称字符串有:" + count);
	}

}
