package com.test.method1.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author fanzx
 * @create 2021/8/17 15:17
 */
public class ALog implements AfterReturningAdvice {

    /**
     * 后置通知
     * @param returnValue
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("第一种方式 后置通知执行" + method.getName() + "----" + target.getClass().getClassLoader());
        System.out.println("第一种方式 后置通知的返回值为: "+ returnValue);
    }
}
