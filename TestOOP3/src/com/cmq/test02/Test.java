package com.cmq.test02;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 4:47 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a==b);
        Phone p1 = new Phone("huaweip40", 2035.98, 2020);
        Phone p2 = new Phone("huaweip40", 2035.98, 2020);
        System.out.println(p1==p2);//-> compare address
        System.out.println(p1.equals(p2));
        Cat c = new Cat();
        System.out.println(p1.equals(c));
    }
}
