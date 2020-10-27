package com.yiming.java1026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
*/
public class HashMapTest01 {
    public static void main(String[] args){
        /*Map<Integer,String> map = new HashMap<>();
        map.put(111,"zhangshan");
        map.put(112,"zhangsha");
        map.put(113,"zhangsh");
        map.put(114,"zhangs");

        System.out.println(map.size());

        // 遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> entry : set){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
*/
        Student s1 = new Student("小明");
        Student s2 = new Student("小明");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }
}
