package com.cmq.test11;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: cmq
 * @date: 8/8/2024 - 08 - 08 - 4:48 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(new Student(19,"blili",170),1001);
        map.put(new Student(18,"alili",150),1002);
        map.put(new Student(19,"alili", 140),1003);
        map.put(new Student(17,"clili",130),1004);
        map.put(new Student(10,"dlili", 180),1005);
        System.out.println(map.size());
        System.out.println(map);
    }

}
