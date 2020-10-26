package com.yiming.java1026;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向Map集合添加元素
        map.put(1,"123");
        map.put(2,"234");
        map.put(3,"345");
        map.put(4,"456");

        //通过key获取value
        String value = map.get(2);
        System.out.println(value);

        //获取键值对的数量
        System.out.println(map.size());

        //删除键值对，实际将键值取出，返回value值
        System.out.println(map.remove(4));
        //map中key==4 value=="456" 已被删除

        //判断是否包含某个key
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(6));

        //判断是否包含某个value
        System.out.println(map.containsValue("234"));
        //contians底层是用equals比较的

        //Collection<V> values()  获取Map集合中所有的value，返回一个Collection
        //返回此映射中包含的值的 Collection 视图。
        Collection<String> valuse=  map.values();
        for(String s : valuse){
            System.out.println(s);
        }

        //清空map集合
        map.clear();
        System.out.println(map.size());

        //判断是否为空、
        System.out.println(map.isEmpty());



    }
}
