package com.cmq.test04;

import com.cmq.test04.Student;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 4:44 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("fiefei");
        s.setAge(19);
        s.setSex("xxx");
        System.out.println(s);
        Student s2 = new Student("nana", 21, "aaaa");
        System.out.println(s2);
    }
}
