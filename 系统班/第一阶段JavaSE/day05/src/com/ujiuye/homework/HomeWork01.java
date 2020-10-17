package com.ujiuye.homework;
//随机数导包
import java.util.Random;
public class HomeWork01 {
	public static void main(String[]  args) {
		
		//创建随机数对象
		Random s = new Random();
		String[] student ={"一","二","三","四","五","六","七","八","九","十"};
		/*//遍历方法一
		for(int i = 0 ;i<student.length  ; i++) {
			System.out.println(student[i]);
		}*/
		//遍历方法二 
		for(String stu :student) {
			System.out.print(stu+"\t");
		}
		System.out.println("\n被点到的学生是："+student[s.nextInt(10)]);
	}
	
}
