package com.cmq.test07;

import java.util.HashSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 6:01 PM
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        //self-defined object -> .equals and hashCode
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19, "lili"));
        hs.add(new Student(20, "lulu"));
        hs.add(new Student(18, "lala"));
        hs.add(new Student(19, "lili"));
        hs.add(new Student(10, "nana"));
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
