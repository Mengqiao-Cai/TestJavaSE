package com.cmq.test12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: cmq
 * @date: 8/9/2024 - 08 - 09 - 6:40 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //Collections is private
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Collections.addAll(list, "dd","ee","ff");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, new String[]{"gg, oo, pp"});
        System.out.println(list);
        //sorted
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "cc"));

        Collections.addAll(list2, "tt", "ss");
        Collections.copy(list, list2);
        System.out.println(list);
        System.out.println(list2);

        Collections.fill(list2, "yyy");
        System.out.println(list2);
    }
}
