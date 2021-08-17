package com.test.method2;

/**
 * @author fanzx
 * @create 2021/8/17 15:32
 */
public class DiyMethodAOP {

    public void before(){
        System.out.println("第二种配置方式 DIY前置通知");
    }

    public void after(){
        System.out.println("第二种配 置方式 DIY后置通知");
    }
}
