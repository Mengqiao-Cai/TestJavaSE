package com.cmq.test05;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 4:29 PM
 * @version: 1.0
 */
public interface TestInterface2 {
    public static final int NUM = 10;
    public abstract void a();
    public default void b(){
        System.out.println("TestInterface2--b()");
    }
    public static void c(){
        System.out.println("TestInterface--static method c()");
    }
}
class Demo implements TestInterface2{
    @Override
    public void a() {
        System.out.println("override a()");
    }
    //static method is not related with "override"
    public static void c() {
        System.out.println("static method c() in demo");
    }
}
class A {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
        Demo.c();
        TestInterface2.c();
    }
}