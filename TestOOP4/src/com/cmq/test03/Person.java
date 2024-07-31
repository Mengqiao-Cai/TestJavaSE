package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 2:18 PM
 * @version: 1.0
 */
//if there's an abstract method, this class needs to be an abstract class
//an abstract class can have 0 abstract method
public abstract class Person {
    //one kind of method: no need override, just use it
    public void eat() {
        System.out.println("eating...");
    }
    //one kind of method: always need to override
    //abstract method -> get rid of body and use abstract
    public abstract void say();
    public abstract void sleep();
}

class Student extends Person {
    @Override
    public void say() {
        System.out.println("saying...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}
class Demo{
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void say() {

            }

            @Override
            public void sleep() {

            }
        };
        Student s = new Student();
        s.sleep();
        s.say();
        Person p1 = new Student();

    }
}