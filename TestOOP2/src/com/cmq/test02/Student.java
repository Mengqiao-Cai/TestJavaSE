package com.cmq.test02;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 10:27 PM
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("female")) {
            this.sex = sex;
        } else {
            this.sex = "?";
        }
    }

    public Student() {

    }
    public Student(int age, String name, String sex) {
        this.setAge(age);
        this.setName(name);
        this.setSex(sex);
    }
}
