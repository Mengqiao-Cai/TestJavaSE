package com.cmq.test02;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:04 PM
 * @version: 1.0
 */
public class BuyTicketThread extends Thread {
    public BuyTicketThread(String name) {
        super(name);
    }
    static int ticketNum = 10;
    @Override
    public void run() {
        for (int i=1;i<=100;i++) {
//            synchronized (BuyTicketThread.class) {//threads must use same lock!
//
//            }
        buyTicket();
        }
    }
    public static synchronized void buyTicket() {
        if (ticketNum>0) {
            System.out.println("I bought the No." + ticketNum-- + " ticket from " + Thread.currentThread().getName());
        }
    }
}
