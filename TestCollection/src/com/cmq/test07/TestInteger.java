package com.cmq.test07;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 5:56 PM
 * @version: 1.0
 */
public class TestInteger {
    public static void main(String[] args) {
        //with input sequence
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        System.out.println(hs.add(19));
        hs.add(5);
        System.out.println(hs.add(19));
        hs.add(20);
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
