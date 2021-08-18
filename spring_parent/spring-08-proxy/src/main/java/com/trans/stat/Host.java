package com.trans.stat;

/**
 * @author fanzx
 * @create 2021/8/16 14:50
 * 房东 房东要租房
 */
public class Host implements Rent {

    /**
     * 房东要出租房子
     */
    @Override
    public void rent() {
        System.out.println("房东要出租房子...");
    }
}
