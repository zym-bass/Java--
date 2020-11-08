package com.yiming.java.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表示这个注解只能出现在类上
@Target(ElementType.TYPE)

//该注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
}

@Id
class MyClass{
    int id ;

}