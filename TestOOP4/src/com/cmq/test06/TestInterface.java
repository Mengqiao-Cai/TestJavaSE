package com.cmq.test06;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 4:36 PM
 * @version: 1.0
 */
public interface TestInterface {
    void a();
    void b();
    public default void c() {

    }
}
class Test01 implements TestInterface {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
class Test02 implements TestInterface {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
