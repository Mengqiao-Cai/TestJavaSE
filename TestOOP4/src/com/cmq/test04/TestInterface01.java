package com.cmq.test04;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 3:56 PM
 * @version: 1.0
 */
//1. class and interface are same level concept
//2. no constructor in interface
//3. declare: interface
//before jdk 1.8, there are only 2 parts:
// 1. variable: public static final 2. abstract method: public abstract
public interface TestInterface01 {
    //even if you don't add "public static final/public abstract", IDE will add it for you
    public static final int NUM = 10;
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);
}

//class implements interface
class Student extends Person implements TestInterface01, TestInterFace2{
    @Override
    public void a() {

    }

    @Override
    public void b(int num) {

    }

    @Override
    public int c(String name) {
        return 0;
    }

    @Override
    public void f() {

    }
}

class Person {

}
interface TestInterFace2{
    public abstract void a();
    public abstract void f();
}

class Test{
    public static void main(String[] args) {
        TestInterface01 t = new Student();
        System.out.println(TestInterface01.NUM);
        System.out.println(Student.NUM);
        Student s = new Student();
        System.out.println(s.NUM);
        TestInterface01 t2 = new Student();
        System.out.println(t2.NUM);
    }
}