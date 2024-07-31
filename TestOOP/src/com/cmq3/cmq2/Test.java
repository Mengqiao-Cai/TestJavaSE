package com.cmq3.cmq2;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 3:46 PM
 * @version: 1.0
 */
public class Test {
    /*
    1. there will be an empty constructor
    2. we will give values to attributes in overloading constructor
    3. if we have an overloading constructor but didn't write empty constructor,
    the system won't allocate an empty constructor for you -> might cause errors
    4. better use good name for parameters
     */
    public static void main(String[] args) {

        Person p = new Person(); // give address value of this person to p
        System.out.println(p.age);
        System.out.println(p.name);

        Person p2 = new Person("haha", 27, 283.3);
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
}
