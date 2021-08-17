package com.dynamic;

/**
 * @author fanzx
 * @create 2021/8/17 14:22
 */
public class Client {

    public static void main(String[] args) {

        // 创建代理角色 不存在
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(new Host());
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();




    }

}
