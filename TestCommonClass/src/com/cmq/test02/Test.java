package com.cmq.test02;
import java.util.Date;
/**
 * @author: cmq
 * @date: 7/30/2024 - 07 - 30 - 11:14 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        //deprecated method
        System.out.println(d.toGMTString());
        System.out.println(d.toLocaleString());

        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        /*use which one? ->
        * ->currentTimeMillis -> static method, can directly use
        * native method -> not implement with java
        *
        */
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());

        //calculate how much time it takes
        long startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
