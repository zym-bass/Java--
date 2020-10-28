package com.ujiuye.homework12;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
	/*3. 键盘录入一个正整数n，创建一个大小为n的数组, 再通过键盘录入m（m <= n）个数值，存入上述数组，
			当录入字符串"end"或者录入个数达到n时，结束录入,然后将数组内容、数组最大值按照指定格式进行输出
			如下:
			例如：
			​	请录入数组大小：
			​	10
			​	请录入若干整数
			​	12
			​	4
			​	5
			​	6
			​	7
			​	end

			​	最终结果为：[0, 0, 0, 0, 0,4, 5, 6, 7,12],最大值为12
			
			*
			*  分析 :
			*   1. 为了可以让end通过键盘录入, 因此需要使用键盘录入字符串. nextLine
			*   2.int[] arr = new int[n];
			*     字符串--->int类型整数   Integer.parseInt(String s)--->int
			*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 通过键盘录入一个正整数n, 表示数组长度
		int n = 0;
		while(true) {
			System.out.println("请输入一个正整数作为数组长度:");
			n = sc.nextInt();
			if(n > 0) {
				break;
			}else {
				System.out.println("输入的数组长度有误,请重新输入");
			}
		}
		// 2. 创建出一个长度为n的int类型数组
		int[] arr = new int[n];
		
		// 3.通过键盘录入整数,存储到数组arr中
		System.out.println("请录入若干整数:");
		for(int index = 0; index < arr.length; index++) {
			String number = sc.next();
			// 4. 验证输入的数据是否是end结束
			if("end".equals(number)) {
				break;
			}else {
				int num = Integer.parseInt(number);
				arr[index] = num;
			}
		}
		
		// 5. 将数组中数据进行升序排列
		Arrays.sort(arr);
		// 6. 输出最终结果
		String result = Arrays.toString(arr);
		System.out.println("最终的结果为 : " + result + ",数组中的最大值为:" + arr[arr.length-1]);

	}
}
