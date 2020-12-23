package com.yiming.service;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Aspect
public class PersonAspect {
    //定义切入点
    @Pointcut("execution(* com.yiming.dao.impl.*.*(..))")
    public void anyMethod(){};

    //前置
    @Before("anyMethod()")
    public void doBeforeAdvice(JoinPoint jp){
        String methodName=jp.getSignature().getName();
        Object[] args= jp.getArgs();
        System.out.println("前置通知"+methodName+","+ Arrays.toString(args));
    }


    //后置
    @AfterReturning(pointcut = "anyMethod()" ,returning = "result")
    public void doReturningAdvice(Object result){
        System.out.println("后置通知：" + result);
    }

    //异常通知
    public void doExceptionAdvice(Exception e){
        e.printStackTrace();
        System.out.println("异常");
    }

    //最终通知
    @After("anyMethod()")
    public void doAfterAdvice(){
        System.out.println("最终通知");
    }

}
