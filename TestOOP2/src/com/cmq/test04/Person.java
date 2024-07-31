package com.cmq.test04;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 2:30 PM
 * @version: 1.0
 */
public class Person {
    public Person eat() {
        System.out.println("eating...");
        return new Person();
    }
    public void sleep() {
        System.out.println("sleeping...");
    }
}
