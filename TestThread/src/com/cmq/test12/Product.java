package com.cmq.test12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:10 PM
 * @version: 1.0
 */
public class Product {
    private String brand;
    private String name;
    //lock
    Lock lock = new ReentrantLock();
    //lock can have multiple waiting pool
    // -> producer waiting pool
    Condition produceCondition = lock.newCondition();
    // -> customer waiting pool
    Condition consumeCondition = lock.newCondition();
    boolean flag = false; //default -> no product

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProduct(String brand, String name) {
        lock.lock();
        try {
            if (flag) {
                try {
                    //wait();
                    //block producer
                    produceCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setName(name);
            System.out.println("We just produce: " + this.getBrand() + "-" + this.getName());

            flag = true;
            //notify();
            consumeCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
                    consumeCondition.await();
                    //wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Customer buys: " + this.getBrand()+"---"+this.getName());
            flag = false;
            produceCondition.signal();
            //notify();
        } finally {
            lock.unlock();
        }
    }
}
