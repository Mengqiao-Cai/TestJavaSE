package com.cmq4;

/**
 * @author: cmq
 * @date: 7/20/2024 - 07 - 20 - 2:53 PM
 * @version: 1.0
 */
public class Person {
    int age;
    String name;
    double height;
    public Person() {
    }
    public Person(int age, String name, double height) {
        this(age, name); // must be at first line
        this.height = height;
    }
    public Person(int age, String name){
        this(age);
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    public void eat() {
        int age = 10;
        System.out.println(age);
        System.out.println(name);
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println("I like eating!");
    }
    public void play() {
        System.out.println("video game!");
        this.eat();
    }
}
