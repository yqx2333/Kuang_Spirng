package com.test.method3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author fanzx
 * @create 2021/8/17 15:40
 */
@Aspect // 代表这是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.test.method1.service.PersonServiceImpl.*(..))")
    public void before(){
        System.out.println("注解方式 方法执行前");
    }

    @After("execution(* com.test.method1.service.PersonServiceImpl.*(..))")
    public void after(){
        System.out.println("注解方式 方法执行后");
    }

    /**
     * 在环绕增强中,我们可以给定一个参数 代表我们要获取处理切入的点
     */
    @Around("execution(* com.test.method1.service.PersonServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕前: " + joinPoint);
        // 执行方法
        try {
            // 获得签名
            Signature signature = joinPoint.getSignature();
            System.out.println("============"+signature);
            Object proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后: " + joinPoint);
    }

}
