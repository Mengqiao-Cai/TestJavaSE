package com.cmq11;

//static import
import static  java.lang.Math.*;
/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 9:39 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
        System.out.println(round(5.6)); //use static method in this class first
    }

    public static int round(double a) {
        return 1000;
    }
}
