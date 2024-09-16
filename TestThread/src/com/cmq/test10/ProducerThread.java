package com.cmq.test10;

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
            synchronized (Product.class) {
                if (i%2==0) {
                    p.setBrand("fera");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("choco");
                } else {
                    p.setBrand("tsing");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("beer");
                }
                System.out.println("We just produce: " + p.getBrand()+"-"+p.getName());
            }

        }
    }
}
