package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/25/2024 - 07 - 25 - 1:49 PM
 * @version: 1.0
 */
public class Girl {
    String name;
    double weight;
    Mom m = new Mom();
    public void add(int a) {
        System.out.println(a);
        System.out.println(a+100);
    }
    public void love(Boy b) {
        System.out.println("My boyfriend is: " + b.name + ", his age is " + b.age);
        b.buy();
    }
    public void chatMom() {
        m.say();
    }
    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
