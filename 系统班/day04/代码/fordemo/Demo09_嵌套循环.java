package com.ujiuye.fordemo;

public class Demo09_嵌套循环 {

	public static void main(String[] args) {
		 for(int i = 1; i <= 3; i++){// 表示教练发送指令次数
		        // 学员跑5圈
		        for(int j = 1; j <= 5; j++){
		             System.out.println("教练第" + i + "次发出指令, 目前学员跑到了第" + j + "圈");
		        }
		  } 
	}
}
