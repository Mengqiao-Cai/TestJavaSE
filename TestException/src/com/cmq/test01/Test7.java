package com.cmq.test01;

import java.util.Scanner;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 4:34 PM
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        divide();
    }
    public static void divide() throws Exception {
        Scanner sc = new Scanner((System.in));
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num2 == 0) {
            //create run time exception
            //throw new RuntimeException();
            throw new Exception();
        } else {
            System.out.println(num1/num2);
        }
    }
}
