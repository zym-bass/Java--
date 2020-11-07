package com.ujiuye.functioninterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo04_Predicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(105);
		list.add(99);
		list.add(86);
		list.add(7);
		list.add(120);
		// 客户1 : 筛选出集合中所有小于100的偶数
		Predicate<Integer> pre = x->x < 100 && x % 2 == 0;
		System.out.println(testPredicate(list,pre));
		
		// 客户2 : 筛选出集合中所有的奇数
		Predicate<Integer> pre1 = x->x % 2 != 0;
		System.out.println(testPredicate(list,pre1));
		
		// 客户3 : 筛选出集合中所有大于50的数
		Predicate<Integer> pre2 = x->x > 50;
		System.out.println(testPredicate(list,pre2));
	}
	
	/*需求 : 万能的数据筛选功能; 客户提供一个ArrayList<Integer>容器,
	根据客户的要求, 将容器中符合条件的数据筛选出来, 
	放置到一个新的ArrayList<Integer>容器给客户, 筛选规则由客户决定
	客户1 : 筛选出集合中所有小于100的偶数
	客户2 : 筛选出集合中所有的奇数
	客户3 : 筛选出集合中所有大于50的数
	...
	
	*   分析 : 
	*    1) 第一个参数 : 需要客户提供原始待筛选容器 ArrayList<Integer>
	*    2) 第二个参数 : 需要验证元素是否符合条件的规律(思想),将Predicate作为方法参数,
	*    为了传递test方法功能, boolean test(Integer)
	*/
	public static ArrayList<Integer> testPredicate(ArrayList<Integer> list,Predicate<Integer> pre){
		ArrayList<Integer> newList = new  ArrayList<>();
		// 遍历待筛选的集合, 获取到集合中的每一个元素
		for(int index = 0; index < list.size(); index++) {
			int ele = list.get(index);
			if(pre.test(ele)) {
				newList.add(ele);
			}
		}
		return newList;
	}
}
