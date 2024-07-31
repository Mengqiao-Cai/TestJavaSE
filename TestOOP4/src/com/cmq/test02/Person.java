package com.cmq.test02;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 1:22 PM
 * @version: 1.0
 */
//cant be extends
public final class Person {
    //not letting child override this method
    public final void eat() {
        System.out.println("eating...");
    }
}

//class Student extends Person{
//    public void eat() {
//        super.eat();
//    }
//}
