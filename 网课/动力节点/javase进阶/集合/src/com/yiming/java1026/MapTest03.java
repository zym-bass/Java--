package com.yiming.java1026;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历
*/
public class MapTest03 {
    public static void main(String[] args) {

        //第一种方式
        //创建集合
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"111");
        map.put(2,"222");
        map.put(3,"333");
        map.put(4,"444");
        //遍历Map集合
        //所有的key，所有的key是一个Set集合
        Set<Integer> keys = map.keySet();
        //遍历Key
        //迭代器
        Iterator it = keys.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
        //forEach
        for(Integer i : keys){
            System.out.println(i+"="+map.get(i));
        }

        //第二种方法 Set<Map.Entry<K,V>>entrySet()
        //把Map集合全部转换成Set集合
        //
        Set<Map.Entry<Integer,String>> set = map.entrySet();//set为Node对象
        //遍历set 集合 每回取出一个Node
        //迭代器
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,String> node =  it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(node.getKey() + "=" + node.getValue());
        }

        //forEach 效率高 
        for(Map.Entry<Integer,String> i : set  ){
            System.out.println(i.getKey() + "=" + i.getValue());
        }

    }
}
