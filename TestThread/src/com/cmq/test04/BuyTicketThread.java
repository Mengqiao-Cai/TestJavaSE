package com.cmq.test04;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:16 PM
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable{
    AtomicInteger ticketNum = new AtomicInteger(10);
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        for (int i=1;i<=100;i++) {
//            synchronized (this) {
//            lock.lock();
//            try {
//                if (ticketNum>0) System.out.println("I bought No." + ticketNum-- + " from Window " + Thread.currentThread().getName());
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//            }
            if (ticketNum.get()>0) System.out.println("I bought No." + ticketNum.getAndDecrement() + " from Window " + Thread.currentThread().getName());
        }
    }
}
