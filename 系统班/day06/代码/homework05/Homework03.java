package com.ujiuye.homework05;

public class Homework03 {
/*	3.设计方法功能,打印出如下图形:(右直角三角形)
		    *
		   **
		  ***
		 ****
		*****
		
		分析 : 
		1) 图形中一共需要打印5行, 因此设计出一个5行循环, 每次循环中表示每行输出的数据内容
		2) 每一行中打印什么?
		    第一行 : 4个空格, 1个星星
		    第二行 : 3个空格, 2个星星
		    第三行 : 2个空格, 3个星星
		    第4行 :  1个空格, 4个星星
		    第5行 :  0个空格, 5个星星
		    
		  第一个规律 : 每行   星星个数 + 空格个数 = 5
		  第二个规律 : 每行星星数量与当前行数一致; 每行空格数量 5-行数
		
**/
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {// 外层循环表示打印的行数, i值就表示目前打印到第几行
			// 打印空格
			for(int w = 0; w < 5 - i; w++) {
				System.out.print(" ");
			}
			// 打印星星图形
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 换到下一行进行输出
			System.out.println();
		}

	}
}
