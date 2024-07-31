package com.cmq.test07;

import java.sql.SQLOutput;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 6:00 PM
 * @version: 1.0
 */
public class TestOuter {
    /*inner class: locan inner class <- a class inside another class
    * in: method, block and constructor
    * member inner class: can be static or non-static
    *   inside -> variables, methods, constructor...
    *   keywords: private, default, protect, public, final, abstract
    *   member inner class can visit outer class's variable and methods
    */
    int age = 10;
    static int c;
    class D {
        int age = 20;
        String name;
        public void method(){
            int age =30;
            System.out.println(age); //30
            System.out.println(this.age); //20
            System.out.println(TestOuter.this.age); //10
        }
    }
    static class E {
        public void method(){
            //can only visit static variable or methods in outer class
//            System.out.println(age);
        }
    }
    public void a() {
        System.out.println("a---");
        {
            System.out.println("normal block");
            class B {

            }
        }
        class A {

        }
        D d = new D();
        System.out.println(d.name);
        d.method();
    }
    static {
        System.out.println("static block");
    }
    {
        System.out.println("constructor block");
    }
    public TestOuter(){
        class C {

        }
    }

}

class Demo{
    public static void main(String[] args) {
        TestOuter t = new TestOuter();
        t.a();

        //static inner class
        TestOuter.E e = new TestOuter.E();
        //non-static inner class
        TestOuter.D d = t.new D();
    }
}
