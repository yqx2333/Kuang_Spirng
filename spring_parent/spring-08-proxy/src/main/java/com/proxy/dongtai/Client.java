package com.proxy.dongtai;

/**
 * @author fanzx
 * @create 2021/8/17 11:34
 */
public class Client {

    public static void main(String[] args){

        PersonServiceProxy personServiceProxy = new PersonServiceProxy(new PersonServiceImpl());
        personServiceProxy.add();
        personServiceProxy.update();
        personServiceProxy.deleted();
        personServiceProxy.select();


    }

}
