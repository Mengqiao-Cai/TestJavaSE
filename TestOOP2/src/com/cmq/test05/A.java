package com.cmq.test05;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 2:17 PM
 * @version: 1.0
 */
public class A {
    private int age; //only accessed in this class
    int b; //default //accessed under same package
    protected int c; //accessed under same package and subclasses
    public void eat() {
        System.out.println(age);
    }
}

