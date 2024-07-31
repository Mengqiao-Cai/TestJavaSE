package com.cmq;

import sun.management.Agent;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 2:54 PM
 * @version: 1.0
 */
public class Person {
    //member variables
    int age;
    String name;
    double height;
    double weight;

    public void eat(){
        int num = 10;
        System.out.println("I like eating!");
    }

    public void sleep(String address){
        System.out.println("I sleep at " + address);
    }

    public String introduce(){
        return "My name is: " + name + ",my age is: " + age + ",my height is: " + height + ",my weight is: " + weight;
    }
}
