package com.cmq.test09;

import java.util.Comparator;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 6:32 PM
 * @version: 1.0
 */
public class Student {
    private int age;
    private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}

class CompareStudentAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}

class CompareStudentName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareStudent3 implements Comparator<Student> {
    //if same age -> compare height, else compare age
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()-o2.getAge()==0) {
            return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
        } else {
            return o1.getAge()-o2.getAge();
        }
    }
}
