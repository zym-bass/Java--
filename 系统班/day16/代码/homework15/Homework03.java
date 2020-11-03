package com.ujiuye.homework15;

import java.util.Arrays;

public class Homework03 {
	/*3. 实现如下需求
	 1)现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，
	例如："23,24,25"（直接定义字符串给出即可)。现需要求出这三个年龄的平均年龄
	 2) 对于字符串"张三@@@李四@@王五@矛盾",转化成字符串"张三  李四  王五  矛盾"\
        (注意 : 每个姓名之间都有两个空格)*/
	public static void main(String[] args) {
         String s = "23,24,25";
         // 1. 使用split方法将字符串使用,进行切割
         String[] arr = s.split(",");
         // sum表示年龄总和
         int sum = 0;
         // 2. 遍历arr数组, 获取到每一个年龄
         for(String age : arr) {
        	 int i = Integer.parseInt(age);
        	 // 3. 计算年龄累加和
        	 sum = sum + i;
         }
         
         // 4. 计算平均年龄
         System.out.println("平均年龄为:" + sum / arr.length);
         
         
         
         String name = "张三@@@李四@@王五@矛盾";
         String newName = name.replaceAll("[@]{1,}", "  ");
         System.out.println(newName);
	}
}
