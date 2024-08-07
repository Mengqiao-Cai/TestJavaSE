package com.cmq.test05;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * @author: cmq
 * @date: 8/6/2024 - 08 - 06 - 3:53 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        String s = new String();
        obj = s; //polynomial

        Object[] objArr = new Object[10];
        String[] strArr = new String[10];
        objArr = strArr; //polynomial

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //list1 = list2; // <- wrong

        //A and B are father class and child class
        //G<A> and G<B> does not have inheritance <- they are same level
    }
}
