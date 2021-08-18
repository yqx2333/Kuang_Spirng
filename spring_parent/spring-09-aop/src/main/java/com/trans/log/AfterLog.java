package com.trans.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author fanzx
 * @create 2021/8/17 15:00
 */
public class AfterLog implements AfterReturningAdvice {

    /**
     *
     * @param returnValue  返回值
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "---->" + method.getName() + "---->" +returnValue);
    }
}
