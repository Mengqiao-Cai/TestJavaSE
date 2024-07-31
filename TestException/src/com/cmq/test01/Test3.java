package com.cmq.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 7/27/2024 - 07 - 27 - 4:08 PM
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("input first number: ");
            int num1 = sc.nextInt();
            System.out.println("input second number: ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " divided by " + num2 +" is " + num1/num2);
            return;
        } catch (InputMismatchException ex) {
            System.out.println("--->Exception not valid input");
            //System.out.println(ex);
            //System.out.println(ex.getMessage());
            //ex.printStackTrace(); //print stack information of exception
            //throw(ex); // won't execute later code after try catch block
        } catch (ArithmeticException ex) {
            System.out.println("can't divided by 0");
        } catch (Exception ex) {
            System.out.println("Exception...");
        }
        finally {
            System.out.println("---In finally---");
        }
        //return vs finally -> do finally first, then return
    }
}
