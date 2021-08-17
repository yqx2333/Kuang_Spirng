package com.yqx.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author fanzx
 * @create 2021/8/17 14:56
 */
public class BeforeLog implements MethodBeforeAdvice {

    /**
     *
     * @param method  要执行的方法
     * @param objects 参数
     * @param o       目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "---->" + method.getName());
    }
}
