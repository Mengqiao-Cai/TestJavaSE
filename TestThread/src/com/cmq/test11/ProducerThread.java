package com.cmq.test11;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:10 PM
 * @version: 1.0
 */
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            if (i%2==0) {
                p.setProduct("fero","choco");
            } else {
                p.setProduct("tsing","beer");
            }
        }
    }

}
