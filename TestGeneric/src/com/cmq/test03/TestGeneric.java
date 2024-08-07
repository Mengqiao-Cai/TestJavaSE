package com.cmq.test03;

import java.util.ArrayList;

/**
 * @author: cmq
 * @date: 8/5/2024 - 08 - 05 - 6:13 PM
 * @version: 1.0
 */
public class TestGeneric<A,B,C> {
    A age;
    B name;
    C sex;
    public void a(A m, B n, C x) {

    }
    //cant use generic method with static method
/*    public static int c (A a) {
        return 10;
    }*/
     public void a() {
         //A[] i = new A[10]; // <- wrong
         A[] i = (A[])new Object[10];
     }
    //when build constructor for generic class, you can't add generic here
    public TestGeneric() {

    }
    public void b() {
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //list1 = list2; //<- wrong
    }
}
