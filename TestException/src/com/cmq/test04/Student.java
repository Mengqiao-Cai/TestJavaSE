package com.cmq.test04;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 4:43 PM
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("female") || sex.equals("male")) {
            this.sex = sex;
        } else {
            //throw new RuntimeException("input sex not correct");
            //throw new Exception();
            throw new MyException("wrong sex");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        //this.sex = sex;
        this.setSex(sex);
    }
}
