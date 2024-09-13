package com.cmq.test07;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 12:40 PM
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(this.getName()+"---"+i);
        }
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=100;i++) {
            if (i==20) {
                TestThread tt = new TestThread("tt");
                tt.start();
                tt.join();
            }
            System.out.println("main---"+i);
        }
    }
}