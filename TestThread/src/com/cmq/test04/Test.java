package com.cmq.test04;

import com.cmq.test04.BuyTicketThread;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:18 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BuyTicketThread t = new BuyTicketThread();
        //BuyTicketThread tt = new BuyTicketThread();

        Thread t1 = new Thread(t,"window1");
        Thread t2 = new Thread(t,"window2");
        Thread t3 = new Thread(t,"window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
