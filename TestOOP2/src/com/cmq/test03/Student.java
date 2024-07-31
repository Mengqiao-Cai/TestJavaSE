package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/23/2024 - 07 - 23 - 1:51 PM
 * @version: 1.0
 */
public class Student extends Person{
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    public void study() {
        System.out.println("student studying...");
    }
}
