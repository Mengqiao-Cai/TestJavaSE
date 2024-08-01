package com.cmq.test03;

import java.util.Random;

/**
 * @author: cmq
 * @date: 8/1/2024 - 08 - 01 - 2:30 PM
 * @version: 1.0
 */
public class Test02 {
    //random
    public static void main(String[] args) {
        Random r1 = new Random(System.nanoTime());
        System.out.println(r1.nextInt());

        Random r2 = new Random();
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt(10));
        System.out.println(r2.nextDouble()); //0.0-1.0
    }
}
