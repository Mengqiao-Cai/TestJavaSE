package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 9:56 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
//        g.age = 18;
//        System.out.println(g.age);
        g.setAge(30);
        System.out.println(g.getAge());
    }
}
