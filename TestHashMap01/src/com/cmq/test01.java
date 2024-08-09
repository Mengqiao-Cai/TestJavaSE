package com.cmq;

import java.util.HashMap;

/**
 * @author: cmq
 * @date: 8/8/2024 - 08 - 08 - 8:00 PM
 * @version: 1.0
 */
public class test01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(12, "lili");
        hm.put(7, "feifei");
        hm.put(19, "lulu");
        hm.put(12, "mingming");
        hm.put(6, "yaya");

        System.out.println(hm);
        System.out.println(hm.size());
    }
}
