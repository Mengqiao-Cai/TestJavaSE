package com.cmq.test11;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: cmq
 * @date: 8/8/2024 - 08 - 08 - 4:45 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("clili",1234);
        map.put("dlili",2345);
        map.put("alili",5467);
        map.put("blili",5678);
        map.put("blili",2345);
        System.out.println(map.size());
        System.out.println(map);
    }
}
