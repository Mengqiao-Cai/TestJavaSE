package com.cmq.test03;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:12 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        Thread t = new Thread(t1,"t1");
        t.start();

        for (int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
