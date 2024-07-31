package com.cmq.test01;

import java.util.Scanner;

/**
 * @author: cmq
 * @date: 7/27/2024 - 07 - 27 - 3:31 PM
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("input first number: ");
            int num1 = sc.nextInt();
            System.out.println("input second number: ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " divided by " + num2 +" is " + num1/num2);
        } catch (Exception ex) {
            System.out.println("--->Exception...");
        }
        System.out.println("---After try catch---");
    }
}



