package com.cmq.test10;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 11:56 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Comparator<Student> com = new CompareStudent();
        Comparator<Student> com2 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Student> ts = new TreeSet<>(com);
        ts.add(new Student(10, 190, "elili"));
        ts.add(new Student(9, 190, "blili"));
        ts.add(new Student(15, 190, "clili"));
        ts.add(new Student(7, 190, "alili"));
        System.out.println(ts.size());
        System.out.println(ts);

        
    }
}
