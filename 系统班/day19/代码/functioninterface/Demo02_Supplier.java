package com.ujiuye.functioninterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Demo02_Supplier {

	public static void main(String[] args) {
		//客户1 : 存储5个数据, 数据是30-80之间的随机数 
		// (0-50) + 30
		Supplier<Integer> sup = ()->new Random().nextInt(51) + 30;
		ArrayList<Integer> list1 = testSupplier(5,sup);
		System.out.println(list1);
		
		//客户2 : 存储8个数据, 数据是1-100之间的随机偶数
		Supplier<Integer> sup1 = ()->{
			Random ran = new Random();
			int number = ran.nextInt(100) + 1;
			while(true) {
				if(number % 2 == 0) {
					break;
				}else {
					number = ran.nextInt(100) + 1;
				}
			}
			return number;
		};
		System.out.println(testSupplier(8,sup1));
	}
	/*需求 : 定义出一个方法功能, 方法能给客户返回一个ArrayList<Integer>容器, 
	 * 返回的容器中包含几个数据, 集合中存储的数据有什么规律, 根据客户的实际要求决定
	客户1 : 存储5个数据, 数据是30-80之间的随机数
	客户2 : 存储8个数据, 数据是1-100之间的随机偶数
	...
	每一个客户都需要得到符合条件的集合容器
	
	*
	*  分析 :
	*    1) 第一个参数 : 需要集合中存储的数据个数  int count
	*    2) 第二个参数 : 需要给出集合中存储的数据获取规律, 可以将Supplier作为方法的参数传递,
	*    相当于传递T get()
	*/
	public static ArrayList<Integer> testSupplier(int count, Supplier<Integer> sup){
		ArrayList<Integer> list = new ArrayList<>();
		// 向list集合中添加元素数据
		for(int i = 1; i <= count ; i ++) {
			// 就需要Integer类型数据, 问题就是Integer类型数据的获取方式没法确定
			list.add(sup.get());
		}
		return list;
	}
}
