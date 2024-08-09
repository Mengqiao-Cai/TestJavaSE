package com.cmq.test11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: cmq
 * @date: 8/8/2024 - 08 - 08 - 2:08 AM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //no sequence, unique
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("lili", 101010));
        map.put("nana",123123);
        map.put("fafa",323212);
        System.out.println(map.put("lili", 382813));
        map.put("mingming",22934);
        System.out.println(map.size());
        System.out.println(map);
        map.remove("fafa");
        System.out.println(map);
        System.out.println(map.containsKey("lili"));
        System.out.println(map.containsValue("22934"));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("lili", 101010);
        map2.put("nana",123123);
        map2.put("fafa",323212);
        map2.put("lili", 382813);
        map2.put("mingming",22934);
        map2.remove("fafa");
        System.out.println("------------");
        System.out.println(map.equals(map2));

        System.out.println(map.get("nana"));
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        Set<String> strings = map2.keySet();
        for (String s:strings) {
            System.out.print(s+" ");
        }
        System.out.println("--------");
        Collection<Integer> values = map2.values();
        for (Integer i:values) {
            System.out.print(i+"\t");
        }
        System.out.println("---------");
        Set<String> strings1 = map2.keySet();
        for (String s:strings1) {
            System.out.print(map2.get(s)+"\t");
        }
        System.out.println("---------");
        Set<Map.Entry<String, Integer>> entries = map2.entrySet();
        for (Map.Entry<String, Integer> e:entries) {
            System.out.print(e.getKey()+":"+e.getValue()+"\t");
        }
        map.put(null, 9292);
        //change HashMap -> LinkedHashMap -> sorted by input sequence
    }
}
