package com.cmq.test07;

import java.util.HashSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 5:58 PM
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("html");
        hs.add("apple");
        hs.add("css");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
