package com.cmq.test01;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 1:54 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("main thread");
        for (int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"1-"+i);
        }
        TestThread t1 = new TestThread("t1-");
        //t1.setName("t1-");
        //t1.run();
        t1.start();
        for (int i=1;i<=100;i++) {
            System.out.println(Thread.currentThread().getName()+"2-"+i);
        }
    }
}
