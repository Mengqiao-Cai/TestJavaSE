package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/25/2024 - 07 - 25 - 1:48 PM
 * @version: 1.0
 */
public class Boy {
    int age;
    String name;
    public void buy() {
        System.out.println("buying...");
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
