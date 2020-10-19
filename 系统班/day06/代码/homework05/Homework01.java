package com.ujiuye.homework05;

import java.util.Random;
public class Homework01 {
	/*1. 分析以下需求，并用代码实现：
         随机点名器
	即在全班同学中(共10人)随机的打印出一名同学名字
	要做的随机点名器，它具备以下3个内容：
                1. 自己定义10个学生的名字,并将同学姓名进行存储
                2. 遍历全班同学的姓名,将每位学生姓名打印在控制台上
                3. 在10人中,随机点名,将被点名同学姓名打印到控制台上*/
	public static void main(String[] args) {
        // 1.定义出一个nameArr数组容器, 用于存储10个学生姓名
		String[] nameArr = {"李1","李2","李3","李4","李5","李6","李7","李8","李9","李10"};
		// 2. 遍历nameArr数组
		for(int index = 0; index < nameArr.length; index++) {
			String name = nameArr[index];
			System.out.print(name + "  ");
		}
		System.out.println();
		// 3. 10个学生对应的索引编号 0-9, 需要生成0-9之间的一个任意随机数
		Random ran = new Random();
		// 4. number表示点名随机数
		int number = ran.nextInt(10);
		// 5. 获取到被点名的同学姓名
		String endName = nameArr[number];
		
		System.out.println("目前点名第" + (number + 1) + "个同学,姓名为: " + endName);
	}
}
