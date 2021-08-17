package com.proxy.jingtai;

/**
 * @author fanzx
 * @create 2021/8/17 11:26
 */
public class Hungry implements Eat {

    @Override
    public void eat() {
        System.out.println("肚子饿 想吃饭");
    }
}
