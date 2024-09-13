package com.cmq.test03;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:11 PM
 * @version: 1.0
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
