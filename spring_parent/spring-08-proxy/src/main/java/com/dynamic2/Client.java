package com.dynamic2;

import com.yqx.dongtai.UserService;

/**
 * @author fanzx
 * @create 2021/8/17 14:32
 */
public class Client {

    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(personService);
        PersonService service = (PersonService) handler.getProxy();
        service.add();

    }

}
