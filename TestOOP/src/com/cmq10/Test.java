package com.cmq10;

//doesn't include class D
//import doesn't include inner packages
import com.cmq9.*;
import com.cmq9.sub.D;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 9:30 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new A();
        new B();
        new C();
        new D();
    }
}
