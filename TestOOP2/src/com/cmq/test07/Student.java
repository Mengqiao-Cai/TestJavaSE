package com.cmq.test07;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 2:12 PM
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    int age = 20;
    public void study() {
        System.out.println("studying...");
    }

    public void a() {
        super.age = 10;
        System.out.println(super.age);
        System.out.println(this.age);
        eat();
        super.eat();
    }
    public void eat() {
        System.out.println("student eating...");
    }
}
