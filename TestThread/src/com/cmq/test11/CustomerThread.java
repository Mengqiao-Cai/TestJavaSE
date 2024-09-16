package com.cmq.test11;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:14 PM
 * @version: 1.0
 */
public class CustomerThread extends Thread {
    private Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (Product.class) {
            for (int i=1;i<=10;i++) {
                p.getProduct();
            }
        }
    }
}
