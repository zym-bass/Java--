package com.ujiuye.homework;
//随机数导包
import java.util.Random;
public class HomeWork02 {
	public static void main(String[] args) {
		//创建随机数对象
		Random s = new Random();
		//创建长度为52的Sting类型数组
		String[] card = new String[52];
		//创建A~K的数组
		String[] leter = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//创建桃，花，片
		String[] arr = {"黑桃","红桃","梅花","方片"};
		//记录card下标
		int q=0 ;
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0 ; j<leter.length ; j++) {
				card[q++] = arr[i]+leter[j];
				System.out.print(card[q-1]+" ");
			}
			System.out.println("\n");
			
		}
		
		/*for (String m : card) {
			System.out.println(m);
		}*/
		int[] randnu = new int[] {-1,-1,-1};
		
		//i randnu的下标
		for(int i  = 0 ; i<randnu.length; i++) {
			q= s.nextInt(52);
			//判断重复次数
			int x =0;
			for(int j = 0 ;j<randnu.length  ;j++) {
				/*System.out.println("当前数组下标"+i);
				System.out.println("随机数："+q);
				System.out.println("比较下标值"+randnu[j]);*/
				if(randnu[j] == q  ) {
					x++;
				}
			}
			//System.out.println("抽到第"+(q+1)+"张"+card[q]);
			if(x==0) {
			randnu[i]=q;
			System.out.println("w"+randnu[i]);
			}else {
				i--;
			}
		}
		//对取出来的下标排列
		for(int i= 0 ;i<randnu.length ;i++) {
			for(int j = 0 ;j<randnu.length-1-i ;j++)
			if(randnu[j] >randnu[j+1]) {
				randnu[j] = randnu[j]^randnu[j+1];
				randnu[j+1] = randnu[j]^randnu[j+1];
				randnu[j] = randnu[j]^randnu[j+1];		
			}
		}
		for(int i  = 0 ; i<randnu.length; i++) {
			System.out.println("抽到第"+(randnu[i]+1)+"张"+card[randnu[i]]);
		}
		
		
		
	}
}
