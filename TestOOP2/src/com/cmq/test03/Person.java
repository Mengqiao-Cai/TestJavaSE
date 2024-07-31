package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 1:49 PM
 * @version: 1.0
 */
public class Person {
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void eat() {
        System.out.println("eating...");
    }
    public void sleep() {
        System.out.println("sleeping...");
    }


}
