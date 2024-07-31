package com.cmq.test02;

import java.sql.SQLOutput;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 10:27 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("nana");
        s1.setAge(19);
        s1.setSex("asdfjkl");
        System.out.println(s1.getName() + "---" + s1.getAge() + "---" + s1.getSex());

        Student s2 = new Student(18, "feifei", "asdfasdf");
        System.out.println(s2.getName() + "---" + s2.getAge() + "---" + s2.getSex());
    }
}
