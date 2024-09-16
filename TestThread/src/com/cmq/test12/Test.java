package com.cmq.test12;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:17 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        ProducerThread pt1 = new ProducerThread(p);
        ProducerThread pt2 = new ProducerThread(p);

        CustomerThread ct1 = new CustomerThread(p);
        CustomerThread ct2 = new CustomerThread(p);

        pt1.start();
        pt2.start();
        ct1.start();
        ct2.start();
    }
}
