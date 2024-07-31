package com.cmq5;

import javax.sound.sampled.SourceDataLine;

/**
 * @author: cmq
 * @date: 7/20/2024 - 07 - 20 - 3:50 PM
 * @version: 1.0
 */
public class Demo {
    int id;
    static int sid;
    public void a() {
        System.out.println("----a");
        System.out.println(id);
        System.out.println(sid);
    }
    public static void b() {
        System.out.println("----b");
        //System.out.println(id); //we cannot visit non-static attribute
        //also cannot visit non-static method
        //cannot use "this" keyword
        System.out.println(sid);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.a();

        Demo.b(); //recommended
        d.b();
    }
}
