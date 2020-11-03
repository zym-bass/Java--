package com.ujiuye.homework15;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {

	public static void main(String[] args) {
        // 1. 组合54张扑克牌
		String[] flower = {"♥","♠","♣","♦"};
		String[] puke = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		// pai用于存在54张扑克牌, 按照大小顺序进行存储
		ArrayList<String> pai = new ArrayList<>();
		// paiNo用于存储扑克牌对应的牌号, 牌号决定牌的大小顺序
		ArrayList<Integer> paiNo = new ArrayList<>();
		// count表示扑克牌对用的牌号
		int count = 2;
		for(String p : puke) { 
			for(String f : flower) {
				pai.add(f + p);
				paiNo.add(count);
				count++;
			}
		}
		
		// 将大小王添加到pai中
		pai.add(0,"大王");
		paiNo.add(0,0);
		pai.add(1,"小王");
		paiNo.add(1,1);
		
		// 2. 洗牌
		Collections.shuffle(paiNo);
		
		// 3. 发牌
		ArrayList<Integer> play1 = new ArrayList<>();
		ArrayList<Integer> play2 = new ArrayList<>();
		ArrayList<Integer> play3 = new ArrayList<>();
		ArrayList<Integer> bottom = new ArrayList<>();
		
		for(int index = 0; index < paiNo.size(); index++) {
			int no = paiNo.get(index);
			if(index < 3) {
				bottom.add(no);
			}else if(index % 3 == 0) {
				play1.add(no);
			}else if(index % 3 == 1) {
				play2.add(no);
			}else if(index % 3 == 2) {
				play3.add(no);
			}
		}
		
		// 4. 看牌
		lookPai(play1,pai,"玩家1");
		lookPai(play2,pai,"玩家2");
		lookPai(play3,pai,"玩家3");
		lookPai(bottom,pai,"底牌");
	}
	
	public static void lookPai(ArrayList<Integer> play, ArrayList<String> pai, String name) {
		 // 1) 需要将玩家手中的牌号进行默认升序排列 : 牌号越小对应的牌面越大
		 Collections.sort(play);
		 StringBuilder sb = new StringBuilder(name + "  [");
		 // 2) 遍历play集合, 获取到每一个牌号, 将每一个牌号对应pai集合中的实际扑克牌
		 for(int index = 0; index < play.size(); index++) {
			 int no = play.get(index);
			 if(index == play.size()-1) {
				 sb.append(pai.get(no) + "]");
			 }else {
				 sb.append(pai.get(no) + ",");
			 }
		 }
		 System.out.println(sb);
	}
}
