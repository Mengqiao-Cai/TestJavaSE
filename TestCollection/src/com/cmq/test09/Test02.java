package com.cmq.test09;

import java.util.Comparator;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 6:33 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student(10, 160.5, "alili");
        Student s2 = new Student(14, 170, "anana");

        //outer comparator is better -> you can set multiple compare rule
        Comparator c = new CompareStudentAge();
        System.out.println(c.compare(s1, s2));
        Comparator c2 = new CompareStudentName();
        System.out.println(c.compare(s1, s2));
    }
}
