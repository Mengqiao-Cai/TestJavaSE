package com.cmq.test04;

/**
 * @author: cmq
 * @date: 8/5/2024 - 08 - 05 - 8:09 PM
 * @version: 1.0
 */
//generic method -> needs to be different from the generic parameter in the class definition
public class TestGeneric<E> {
    //not a generic method
    public void a(E e) {

    }
    //This is a generic method
    public static <T> void b(T t) {

    }
    public static void main(String[] args) {

    }
}

class Demo {
    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric<>();
        tg.a("abc");
        tg.b("abc");
        tg.b(20);
        tg.b(false);
    }
}
