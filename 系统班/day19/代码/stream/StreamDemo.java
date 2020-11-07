package com.ujiuye.stream;

import java.util.ArrayList;

public class StreamDemo {
	// 需求 : 定义出一个集合ArrayList<String>, 
	// 中存储的都是一些人物的姓名, 筛选出所有姓张的, 名字中有3个字的名称数据
	public static void main(String[] args) {
         ArrayList<String> listName = new ArrayList<>();
         listName.add("张三丰");
         listName.add("张无忌");
         listName.add("赵敏");
         listName.add("周芷若");
         listName.add("张五");
         listName.add("张成功");
         
         // 1. 通过stream方法获取到可以操作集合数据的Stream流资源
         // predicate : 唯一抽象方法 boolean test(T)
         listName.stream().filter(x->x.startsWith("张") && x.length() == 3)
             .forEach(System.out :: println);
         
         // 2. 姓张的,名字长度为3的姓名有几个
         long number = listName.stream().filter(x->x.startsWith("张") && x.length() == 3).count();
         System.out.println(number);// 3
         
         // 3. 排除前两个姓名之外, 剩下的姓张的,名字长度为3的姓名
         listName.stream().skip(2).filter(x->x.startsWith("张") && x.length() == 3)
           .forEach(System.out :: println);
         
         
         System.out.println("-------");
         
         // 4. 前3个元素中,姓张的,名字长度为3的姓名
         listName.stream().limit(3).filter(x->x.startsWith("张") && x.length() == 3)
          .forEach(System.out :: println);
	}
}
