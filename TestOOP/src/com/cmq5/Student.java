package com.cmq5;

/**
 * @author: cmq
 * @date: 7/20/2024 - 07 - 20 - 3:40 PM
 * @version: 1.0
 */
public class Student {
    String name;
    int age;
    static String school;

    public static void main(String[] args) {
        Student.school = "school1";
        Student s1 = new Student();
        s1.name = "zs";
        s1.age = 19;
        //s1.school = "school 1";

        Student s2 = new Student();
        s2.name = "ls";
        s2.age = 20;
        //s2.school = "school 1";
        System.out.println(s1.school + s2.school);
    }
}
