package com.yiming.spring;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class SpringApplicationContext {
    private Map<String , Object> map = new HashMap<>();

    public SpringApplicationContext(String file) {
        //1. 利用ResourceBundle的getBundle方法返回一个ResourceBundle
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        //2. 找到所有key的枚举对象
        Enumeration<String> keys = bundle.getKeys();
        //3. 循环枚举
        while (keys.hasMoreElements()){
            try {
                String key = keys.nextElement();
                String className = bundle.getString(key);
                Class clazz = Class.forName(className);
                Object value = clazz.newInstance();
                map.put(key,value);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    public  Object getBean(String key){
        return map.get(key);
    }
}
