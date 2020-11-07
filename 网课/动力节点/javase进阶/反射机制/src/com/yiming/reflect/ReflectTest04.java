package com.yiming.reflect;

/*
    研究文件路径
        解释：
            Thread.currentThread() 当前线程对象
            getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载对象
            getResource() 【获取资源】 这是类加载器对象的方法，当前线程的类加载默认从类的根路径下加载资源

*/
public class ReflectTest04 {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("F:\\Java--\\JDK-API-1.8\\jdk api 1.8_google.chw").getPath();//这种获取文件绝对路径是通用的  但必须在

        System.out.println(path);
    }
}
