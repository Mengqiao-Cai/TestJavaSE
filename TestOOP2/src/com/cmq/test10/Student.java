package com.cmq.test10;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 3:03 PM
 * @version: 1.0
 */
public class Student extends Person {
    double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        super(age, name);
        this.height = height;
    }
}
