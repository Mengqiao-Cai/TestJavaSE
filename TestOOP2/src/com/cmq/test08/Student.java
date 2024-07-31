package com.cmq.test08;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 2:32 PM
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    int age = 20;

    public Student() {
        //super();
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score) {
//        super.age = age;
//        super.name = name;
        super(age, name);
//        this(score); //you cannot use super() and this() at the same time
        this.score = score;
    }
}
