package com.ujiuye.functioninterface;

import java.util.function.Consumer;

public class Demo01_Consumer {

	public static void main(String[] args) {
		//客户1 : 花了500元, 买了一把大宝剑
		Consumer<Double> con = x->System.out.println("花了"+ x + "元,买了一把大宝剑");
		testConsumer(500,con);
		
		//客户2 : 花了400元, 买了一双球鞋
		Consumer<Double> con1 = x->{
			if(x <= 500) {
				System.out.println("非常节省,花了" + x + "元买了一双限量版球鞋");
			}else {
				System.out.println("先不买,攒钱");
			}
		};
		testConsumer(400,con1);
	}
	
	/*需求 : 定义出一个方法功能, 客户消费指定金额, 这些金额都如何消费的
	客户1 : 花了500元, 买了一把大宝剑
	客户2 : 花了400元, 买了一双球鞋
	客户3 : 花了888元, 买了一套护肤品
	... 还有很多很多的客户, 对于指定金额有不同的消费
	
	*
	*  分析 : 
	*    1) 需要知道客户消费金额, double money
	*    2) 需要知道客户对于money怎么消费, 于是可以将Cunsumer接口作为方法参数传递,
	*    相当于使用accept(Double money)
	*/
	
	public static void testConsumer(double money, Consumer<Double> con) {
         con.accept(money);		
	}
}
