package com.cmq.test09;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 2:54 PM
 * @version: 1.0
 */
public class Student extends Person {
    double height;
    double weight;

    public Student() {
    }

    public Student(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }
}
