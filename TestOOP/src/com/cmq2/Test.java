package com.cmq2;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 3:46 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*
        progress to build an object:
        1. first time meet person, load the class(only once)
        2.build the object, get space for object in heap
        3.initialize the object's attributes


        new keyword is using a method: constructor
        when calling constructor, if you didn't write the constructor in your class
        system will arrange a constructor for you <- we can't see it

        you can write a constructor to visualize
        format:
        [modifier] name of constructor(){

        }
        difference between constructor and method:
        1. no return
        2. name must be same as class name

        function: not to build the object <- before using constructor,
        the object is built already with default attribute values
        -> give values to the attributes

        we tend to not initialize attribute values in empty constructor
        or every object will have same attribute values

        in fact, we just need to make sure the constructor exists to
        avoid potential errors
         */


        Person p = new Person(); // give address value of this person to p
        System.out.println(p.age);
        System.out.println(p.name);

        Person p2 = new Person();
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
}
