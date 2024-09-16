package com.cmq.test11;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 3:10 PM
 * @version: 1.0
 */
public class Product {
    private String brand;
    private String name;
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
    public synchronized void setProduct(String brand, String name) {
        if (flag) {
            try {
                wait();
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
        notify();
    }
    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Customer buys: " + this.getBrand()+"---"+this.getName());
        flag = false;
        notify();
    }
}
