package com.test.method1.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author fanzx
 * @create 2021/8/17 15:16
 */
public class BLog implements MethodBeforeAdvice {

    /**
     * 前置通知
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("第一种方式 前置通知执行" + method.getName() + "----" + target.getClass().getClassLoader());
    }
}
