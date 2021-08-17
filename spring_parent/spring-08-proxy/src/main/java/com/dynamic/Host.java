package com.dynamic;

/**
 * @author fanzx
 * @create 2021/8/17 14:16
 */
public class Host implements Rent{

    /**
     * 真实对象 房东
     */
    @Override
    public void rent() {
        System.out.println("房东要租房");
    }
}
