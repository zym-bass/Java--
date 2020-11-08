package com.yiming.java.annotation;

import java.lang.annotation.Retention;

public class MyAnnotationTest {

    /*
    //报错的原因：如果一个注解当中的属性，那么必须给属性赋值。(除非注解使用的default赋值)
    @MyAnnotation()
    public void doSome(){

    }*/
    //@MyAnnotation(name="zhangsan")
    /*@MyAnnotation(value = "wrw",name="张三")
    public void doSome(){

    }*/

    /*@MyAnnotation(name="张四",color = "红色")
    public void doSome(){

    }*/

}
