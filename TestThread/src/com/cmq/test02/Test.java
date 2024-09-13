package com.cmq.test02;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:05 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BuyTicketThread t1 = new BuyTicketThread("window1");
        BuyTicketThread t2 = new BuyTicketThread("window2");
        BuyTicketThread t3 = new BuyTicketThread("window3");

        t1.start();
        t2.start();
        t3.start();
    }
}
