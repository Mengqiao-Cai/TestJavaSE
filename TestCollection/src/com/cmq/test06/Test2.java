package com.cmq.test06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 5:39 PM
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

/*        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if ("cc".equals(it.next())) {
                list.add("kk");
            };
        }*/

        //ListIterator <- let it do all things
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            if ("cc".equals(it.next())) {
                it.add("kk");
            }
        }
        System.out.println(list);
    }
}
