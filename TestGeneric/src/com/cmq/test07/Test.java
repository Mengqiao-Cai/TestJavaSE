package com.cmq.test07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cmq
 * @date: 8/6/2024 - 08 - 06 - 4:13 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();

        //limited generic <- roof
        List<? extends Person> list1 = null;
        //list1 = a;
        list1 = b;
        list1 = c;

        //limited generic <- floor
        List<? super Person> list2 = null;
        list2 = a;
        list2 = b;
        //list2 = c;
    }
}
