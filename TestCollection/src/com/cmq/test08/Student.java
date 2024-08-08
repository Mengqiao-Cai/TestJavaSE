package com.cmq.test08;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 6:32 PM
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        //return this.getAge()-o.getAge();
        //return ((Double)(this.getHeight())).compareTo((Double)(o.getHeight()));
        return this.getName().compareTo(o.getName());
    }
}
