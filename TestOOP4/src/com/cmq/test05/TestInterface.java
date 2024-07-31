package com.cmq.test05;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 4:24 PM
 * @version: 1.0
 */

//after 1.8, can use public default, must write "default"
public interface TestInterface {
    public static final int NUM = 10;
    public abstract void a();
    public default void b(){
        System.out.println("TestInterface---b()---");
    }
}
class Test implements TestInterface{
    @Override
    public void a() {
        System.out.println("override a...");
    }

    //if you want to override non-abstract method -> DO NOT write "default"
//    @Override
//    public void b() {
//        TestInterface.super.b();
//    }
    public void c() {
        b();
        //super.b(); <- wrong
        TestInterface.super.b(); // <- so weird lol
    }
}
