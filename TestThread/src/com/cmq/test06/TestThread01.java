package com.cmq.test06;

import com.cmq.test05.TestRandomNum;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:57 PM
 * @version: 1.0
 */
public class TestThread01 extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }
    }
}
class TestThread02 extends Thread {
    @Override
    public void run() {
        for (int i=20;i<=30;i++) {
            System.out.println(i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        TestThread01 t1 = new TestThread01();
        TestThread02 t2 = new TestThread02();
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
