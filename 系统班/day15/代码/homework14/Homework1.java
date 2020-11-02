package com.ujiuye.homework14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {
	/*1. 定义字符串aaaabbccddd!@#@#$@#$%cc66ff, 统计每个字符出现的次数,
	将字符与其对应的数量存储在Map集合中, 遍历集合得到如下输出结果
	    a有4个，b有2个，c有4个，d有3个，!有1个，@有3个，$有2个，%有1个，6有2个，f有2个
	    
	    *
	    *  Map<Character,Integer>  map---> 用于存储字符与数量对应关系
	         *   分析 :
	    *   1. 需要获取到字符串中的每一个字符, toCharArray()---->char[]
	    *   2. 遍历char[]数组, 获取到每一个字符
	    *      map.put(字符,?);
	    *          利用put方法两种使用方式 : 
	    *       a : 添加的字符a, 如果在map集合的key值中不存在, 证明字符第一次添加, 计数为1
	    *       b : 添加的字符a, 如果在map集合的key值中存在, 证明字符a不是第一次添加到集合中,
	    *                             需要获取到a字符的计数结果map.get(字符) + 1, 得到新的计数结果
	    *       
	    *      map.put(a,计数);
	    */
	public static void main(String[] args) {
         // 1.定义出一个字符串
		 String s = "aaaabbccddd!@#@#$@#$%cc66ff";
		 // 2.map用于存储字符与数量对应关系
		 Map<Character, Integer> map = new HashMap<>();
		 // 3. 字符串转换成一个字符数组
		 char[] ch = s.toCharArray();
		 // 4. 遍历ch数组, 获取到每一个字符
		 for(char c : ch) {
			 // 验证当前的字符c在map集合中是否是第一次存储
			 if(map.containsKey(c)) {// c字符不是第一次存储
				 // 先获取到c字符之前的存储数量, +1 得到最新技术器
				 Integer value = map.get(c) + 1;
				 map.put(c, value);
			 }else {// c字符是第一次存储
				 map.put(c, 1);
			 }
		 }
		 
		// 5. 遍历map集合
		Set<Character> set = map.keySet();
		for(Character key : set) {
			Integer v = map.get(key);
			System.out.print(key + "有" + v + "个    ");
		}
	}
}
