package com.yqx.thread.demo01;

/**
 * @author fanzx
 * @create 2021/9/24 14:35
 * 实现线程的方式 Thread
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我也不知道-->" + i);
        }
    }
    public static void main(String[] args) {
        // 创建ThreadTest对象,调用start方法开启线程;
        TestThread testThread = new TestThread();
        testThread.start();
        // main方法主线程
        for (int i = 0; i < 20; i++) {
            System.out.println("道知不也我-->" + i);
        }
    }
}
