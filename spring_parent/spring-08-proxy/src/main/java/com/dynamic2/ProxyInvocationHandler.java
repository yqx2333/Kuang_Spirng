package com.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fanzx
 * @create 2021/8/17 14:28
 * 创建一个万能动态代理对象 自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     * @param
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    /**
     * 处理代理实例,并返回结果
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    /**
     * 代理增强方法
     * @param msg
     */
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
