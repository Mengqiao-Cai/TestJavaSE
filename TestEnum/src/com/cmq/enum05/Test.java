package com.cmq.enum05;

/**
 * @author: cmq
 * @date: 9/25/2024 - 09 - 25 - 5:33 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("dede");
        p.setSex(Gender.female);
        System.out.println(p);
    }
}
