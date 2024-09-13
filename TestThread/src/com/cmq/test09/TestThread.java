package com.cmq.test09;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 12:54 PM
 * @version: 1.0
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=200;i++) {
            System.out.println("testthread---"+i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        TestThread tt  = new TestThread();
        //set first, then start
        tt.setDaemon(true);
        tt.start();

        for (int i=1;i<=50;i++) {
            System.out.println("main---"+i);
        }
    }
}
