package com.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fanzx
 * @create 2021/8/17 14:17
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 获取到要被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 动态生成 得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                        rent.getClass().getInterfaces(),this);
    }

    // 处理代理类,并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(rent, args);
        return invoke;
    }
}
