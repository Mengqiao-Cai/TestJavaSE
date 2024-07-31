package com.cmq.test08;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 6:18 PM
 * @version: 1.0
 */
public class TestOuter {
    public void method() {
        //in local inner class, when you visit outer variable, must be final
        final int num = 10;
        class A {
            public void a() {
                //num = 20;
                System.out.println(num);
            }
        }
    }
    //if class B only used once -> put it as local inner class
    public Comparable method2() {
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }
    public Comparable method3(){
        //anonymous inner class! <- so fking magic
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
    public void test(){
        Comparable com = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        System.out.println(com.compareTo("abc"));
    }
}
