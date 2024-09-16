package com.cmq.test10;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:17 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);

        pt.start();
        ct.start();
    }
}
