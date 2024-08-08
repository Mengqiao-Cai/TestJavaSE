package com.cmq.test08;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 6:25 PM
 * @version: 1.0
 */
public class Test01 {
    //Comparable
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        System.out.println(a-b);*/
        String a = "A";
        String b = "ABC";
        System.out.println(a.compareTo(b));
        double c = 9.6;
        double d = 8.3;
        System.out.println(((Double)c).compareTo((Double)d));
        System.out.println(Double.compare(c,d));
    }
}
