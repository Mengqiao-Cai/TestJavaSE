package com.cmq3.cmq2;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 3:46 PM
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;

    //empty constructor
    public Person() {
/*        age = 19;
        name = "lili";
        height = 169.4;*/
    }

    public Person(String name, int age, double height) {
        //when parameter names are same as attributes' names -> use "this" for attributes' names
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void eat(){
        System.out.println("I like eating!");
    }
}
