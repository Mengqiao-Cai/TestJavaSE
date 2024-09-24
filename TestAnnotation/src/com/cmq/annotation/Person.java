package com.cmq.annotation;

/**
 * @author: cmq
 * @date: 9/23/2024 - 09 - 23 - 5:29 PM
 * @version: 1.0
 */
public class Person {
    /**
     * this is eat
     * @param num1 num of people
     * @param num2 num of dinners
     */
    public void eat(int num1, int num2) {

    }

    /**
     *
     * @param age
     * @return int
     * @exception RuntimeException age too big
     * @see Student
     */
    public int sleep(int age) {
        new Student();
        if (age>100) {
            throw new RuntimeException();
        }
        return 10;
    }
}
