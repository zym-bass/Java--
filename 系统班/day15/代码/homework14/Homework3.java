package com.ujiuye.homework14;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
	/*3. 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
	红色球从1—33中随机生成6个不重复的号码；蓝色球号码从1—16中随机生成1个；
	客户通过键盘录入购买的红色球6个(不重复)和蓝色球1个, 判断客户的中奖状况:
	  1) 买中蓝色球, 红色球全部买中, 1等奖 100万
	  2) 买中蓝色球, 红色球买中3-5个, 2等奖50万
	  3) 买中蓝色球, 红色球买中1个, 3等奖20万
	  4) 其余情况全部算作没有中奖
	要求 : 比较买中的红球时, 要求购买顺序也作为比较依据,购买顺序完全一致才算作买中红球个数, 
	若有某个红色求没有买中, 后面红球无需再比较*/
	public static void main(String[] args) {
		Random ran = new Random();
        // 1. 生成1-16之间中奖蓝色球号码
		int xtBlue = ran.nextInt(16)+1;
		System.out.println("系统生成的中奖蓝色球为:" + xtBlue);
		// 2. 创建出一个存储6个不重复中奖红球集合
		LinkedHashSet<Integer> xtRed = new LinkedHashSet<>();
		// 3. 设计出一个循环, 反复生成1-33之间的随机红色球, 存储到xtRed集合中
		while(xtRed.size() < 6) {
			int number = ran.nextInt(33)+1;
			xtRed.add(number);
		}
		System.out.println(xtRed);
		
		Scanner sc = new Scanner(System.in);
		// 4. 客户购买1-16之间蓝色球:
		System.out.println("请客户购买一个1-16之间蓝色球:");
		int khBlue = sc.nextInt();
		// 验证客户购买求必须在1-16之间
		while(khBlue < 1 || khBlue > 16) {
			System.out.println("购买蓝球范围有误, 请客户购买一个1-16之间蓝色球:");
			khBlue = sc.nextInt();
		}
		
		// 5. 客户购买1-33之间6个不重复红色球
		LinkedHashSet<Integer> khRed = new LinkedHashSet<>();
		while(khRed.size() < 6) {
			System.out.println("请客户购买1-33之间的6个不重复的红色球,目前正在购买第" + (khRed.size()+1) + "个");
			int number = sc.nextInt();
			if(number < 1 || number > 33) {
				System.out.println("购买的红色球范围有误, 请购买1-33之间球号");
			}else {
				khRed.add(number);
			}
		}
		
		System.out.println(khRed);
		
		// 6. 验证客户购买的球与系统中奖球匹配程度, 决定中奖情况
		if(khBlue == xtBlue) {// 蓝色球买中
			// 7. 红色球买中情况xtRed khRed
			// 因为set集合没有索引, 因此没法进行元素定位, 于是将set集合通过toArray(), 转换成带有索引的数组在进行比较
			Object[] xtArrRed = xtRed.toArray();
			Object[] khArrRed = khRed.toArray();
			
			// 8. 定义出一个变量count, 表示买中红色球的数量
			int count = 0;
			for(int index = 0; index < xtArrRed.length; index++) {
				// 获取到每一个系统红色球
				Integer xt = (Integer)xtArrRed[index];
				Integer kh = (Integer)khArrRed[index];
				if(xt == kh) {
					count++;
				}else {
					break;
				}
			}
			
			// 9. 验证买中红球的数量
			switch(count) {
			  case 6:
				System.out.println("1等奖 100万");
				break;
			  case 5:
			  case 4:
			  case 3:
				  System.out.println("2等奖 50万");
			      break;
			  case 1:
				  System.out.println("3等奖 10万");
				  break;
			  default:
				  System.out.println("没有中奖");
			}
		}else {// 没有买中蓝色球, 中奖失败
			System.out.println("没有中奖");
		}
	}
}
