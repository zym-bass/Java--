package com.ujiuye.scanner;

// 1. 导入Scanner类型所在的路径
import java.util.Scanner;
public class Demo01_Scanner {

	public static void main(String[] args) {
		 /*  
		  * 需求 : 通过键盘录入一个整数, 获取到这个整数的2倍
		    */
		
		// 2. 创建出一个Scanner类型对象
		Scanner sc = new Scanner(System.in);
		// 3. 调用Scanner中方法功能nextInt()
		System.out.println("请输入一个整数: ");
		int count = sc.nextInt();
		System.out.println(count + "数值的2倍为: " + count * 2);
        
		
	}

}
