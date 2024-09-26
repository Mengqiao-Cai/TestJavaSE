package com.cmq.enum05;

/**
 * @author: cmq
 * @date: 9/25/2024 - 09 - 25 - 5:33 PM
 * @version: 1.0
 */
public class Person {
    private int age;
    private String name;
    private Gender sex;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

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




}
