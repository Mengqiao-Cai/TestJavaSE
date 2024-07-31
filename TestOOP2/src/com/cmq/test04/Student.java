package com.cmq.test04;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 2:31 PM
 * @version: 1.0
 */
public class Student extends Person{
    public void study() {
        System.out.println("studying...");
    }
    //rewrite superclasses' method
    public Student eat() {
        System.out.println("student eating...");
        return new Student();
    }
}
