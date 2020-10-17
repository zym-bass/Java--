package com.ujiuye.fordemo;

public class Demo10_嵌套循环矩形星星案例 {
	/*需求1 : 打印出如下图形
			*****
			*****
			*****
			*****
	*
	*   提示 : 不要把一行星星看做一个整体, 每一个 * 看成一个独立的个体
	*     类比于 : 教练发送4次指令(对应一共4行数据打印), 每一次指令中, 都跑5圈(每行有5个星星)
	*   
	**/
	public static void main(String[] args) {
           /*
            *  第一种实现方式
            *  
            * for(int i = 1; i <= 4; i++) {// i值表示循环次数
        	   System.out.println("*****");
           }*/
		
		   // 第二种实现方式 : 嵌套循环
		   for( int i = 1; i <= 4; i++) {// 外层循环用于设计星星的打印行数
			   for(int j = 1; j <= 5; j++) {// 内层循环用于反复打印出星星
				   // println 表示输出数据, 数据后添加一次回车换行
				   // print 只表示输出数据
				   System.out.print("*");
			   }
			   // 添加一次回车换行, 换到第二行
			   System.out.println();
		   }
	}
}
