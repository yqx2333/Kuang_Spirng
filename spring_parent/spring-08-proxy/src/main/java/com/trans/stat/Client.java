package com.trans.stat;

/**
 * @author fanzx
 * @create 2021/8/16 14:51
 * 我自己 要去租房
 */
public class Client {

    public static void main(String[] args) {

        // 我现在直接去找房东租房子
        // Host host = new Host();
        // host.rent();

        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        proxy.rent();


    }

}
