package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 5:19 PM
 * @version: 1.0
 */
public class Student extends Person {
    //child class override's method throws exception needs to be <= father's exception
    public void eat() throws RuntimeException{
        System.out.println("1");
    }
}
