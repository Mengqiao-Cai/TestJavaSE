package com.cmq.test02;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 1:09 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1
        final int A = 10;
        //2
        //cant change address
        final Dog d = new Dog();
        //d = new Dog();
        d.age = 10;
        d.weight = 13.7;
        //3
        final Dog d2 = new Dog();
        a(d2);
        //4
        b(d2);

    }

    public static void a(Dog d) {
        d = new Dog();
    }
    public static void b(final Dog d) {
        //cant change d's address
        //d = new Dog();
    }
}
