package com.yiming.java1026;

import java.util.HashMap;
import java.util.Map;
/*
    HashMap 集合Kry部分允许null吗？
        允许
        但是要注意:HashMap集合的key null值只能有一个。
*/

public class HashMapTest02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //向Has和Map集合添加空
        map.put(null,null);
        //判断集合个数
        System.out.println(map.size());
        System.out.println(map.get(null));

        map.put(null,100);
        System.out.println(map.get(null));

    }
}
