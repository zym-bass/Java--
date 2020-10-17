package com.ujiuye.fordemo;

public class Demo12_Break关键字在嵌套循环中使用 {

	public static void main(String[] args) {
		/*需求 : 教练一共发送三次指令, 每次要求学员跑5圈; 
	        实际上学员每次指令只跑3圈回去接收下一次指令, 
	        将教练预期跑圈和学员实际跑圈过程实现出来*/
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println("教练第" + i + "次发出指令, 目前学员跑到了第" + j + "圈");
                if(j == 3) {
					break;
				}
			}
		}
	}
}
