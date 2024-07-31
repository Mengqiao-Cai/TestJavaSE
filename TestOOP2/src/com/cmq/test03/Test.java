package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 1:54 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSno(1001);
        s1.setAge(18);
        s1.setName("feifei");
        s1.setHeight(180.4);

        System.out.println(s1.getAge()+","+s1.getSno());
        s1.study();
        s1.eat();
        s1.sleep();
    }
}
