package com.cmq.test10;

import java.util.TreeSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 11:48 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("elili");
        ts.add("dlili");
        ts.add("clili");
        ts.add("alili");
        ts.add("blili");
        ts.add("alili");
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
