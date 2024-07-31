package com.cmq.test01;

import java.util.Scanner;

/**
 * @author: cmq
 * @date: 7/27/2024 - 07 - 27 - 3:16 PM
 * @version: 1.0
 */
//if-else for exception -> too mixed too heavy, hard to read
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number: ");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.println("input second number: ");
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                if (num2 == 0) {
                    System.out.println("num2 can't be zero");
                } else {
                    System.out.println(num1 + " divided by " + num2 +" is " + num1/num2);
                }
            }
        } else {
            System.out.println("num should be an int");
        }
    }
}
