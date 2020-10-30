package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;

public class Demo01_Map中方法 {

	public static void main(String[] args) {
          Map<Integer, String> map = new HashMap<>();
          //1.如果添加的key值在Map集合中不存在, put方法表示新增; 添加键值对数据到Map集合中
          map.put(2, "b");
          map.put(1, "a");
          map.put(3, "c");
          
          System.out.println(map);//{1=a, 2=b, 3=c}
          
          //2.如果添加的key值在Map集合中存在, put方法表示修改, 表示修改value值
          map.put(2, "hello");
          System.out.println(map);//{1=a, 2=hello, 3=c}
          
         
         //3.containsKey(Object key) : 验证Map集合键中是否包含指定参数key的值, 包含返回true.否则false
	     System.out.println(map.containsKey(3)); // true
	     
	     //4.containsValue(Object value): 验证Map集合值中是否包含指定参数value的值包含返回true.否则false
	     System.out.println(map.containsValue("b"));// false
	     
	     //5.get(Object key) : 通过Map集合中唯一的key值,获取到其对应的value值
	     System.out.println(map.get(2));// hello
	     
	     //6.remove(Object key) : 通过Map集合中唯一的key值, 定位到键值对, 删除键值对, 返回被删除的value值
	     String value =  map.remove(3);
	     System.out.println(value);// c
	     System.out.println(map);// {1=a, 2=hello}
	     
	     //7.size() : 获取到Map集合中的键值对数量, 返回int类型结果
	     System.out.println(map.size() + "----");// 2
	     
	     //8.clear() : 清空Map集合中所有键值对元素
	     map.clear();
         System.out.println(map);//{}
         
         //9.isEmpty() : 验证Map集合中是否还有键值对元素, 如果没有返回true; 有返回false
         System.out.println(map.isEmpty());// true
         System.out.println(map.size());// 0
	}
}
