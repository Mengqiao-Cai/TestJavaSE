package com.cmq.test01;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 1:52 PM
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }
    //run method -> to get cpu resource
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(this.getName()+i);
        }
    }
}
