package com.ujiuye.fordemo;

public class Demo11_嵌套循环直角星星案例 {
/*	需求2 :打印出如下图形
				*
				**
				***
				****
				*****
	*
	*  分析 : 
	*    第一行, 打印1个星  
	*    第二行, 打印2个星  
	*    第三行, 打印3个星  
	*    第四行, 打印4个星
	*    第五行, 打印5个星
	*    
	*    规律 : 每一行打印的星星数量, 与当前的行数一致
	**/
	public static void main(String[] args) {
         for(int i = 1; i <= 5; i++) {// 外层循环表示目前打印的行数
        	 for(int j = 1; j <= i; j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}
}
