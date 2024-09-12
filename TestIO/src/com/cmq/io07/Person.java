package com.cmq.io07;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 10:16 PM
 * @version: 1.0
 */

//serializable: signal interface <- nothing inside
public class Person implements java.io.Serializable {

    private static final long serialVersionUID = 5265977023649970567L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
