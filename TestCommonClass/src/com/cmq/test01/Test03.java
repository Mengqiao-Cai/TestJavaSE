package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/30/2024 - 07 - 30 - 5:26 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        //after jdk 1.5:
        //auto boxing: int -> Integer
        Integer i = 23;
        System.out.println(i);
        Integer i2 = new Integer(23);
        //auto unboxing: Integer -> int
        int num = i2;
        System.out.println(num);
    }
}
