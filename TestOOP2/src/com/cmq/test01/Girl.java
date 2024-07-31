package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 9:56 PM
 * @version: 1.0
 */
public class Girl {
    private int age;
    private int id;
    private String name;
    private double height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        if (this.age >= 30) {
            return 18;
        }
        return age;
    }
}
