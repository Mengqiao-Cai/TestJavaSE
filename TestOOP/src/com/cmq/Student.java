package com.cmq;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 3:32 PM
 * @version: 1.0
 */
public class Student {
    int c;
    byte e;
    public void study(){
        //local variable must be initialized with a value
        int num = 10; //local variable in method
        System.out.println(num);
        {
            int a; //local variable in code block
        }
        int a;
        if (false) {
            int b;
        }
    }

    public void eat(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
    }
}
