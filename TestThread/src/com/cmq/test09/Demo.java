package com.cmq.test09;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 1:12 PM
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            if (i==16) {
                Thread.currentThread().stop();//outdated method
            }
            System.out.println(i);
        }
    }
}
