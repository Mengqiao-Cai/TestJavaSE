package com.cmq.test06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cmq
 * @date: 8/6/2024 - 08 - 06 - 4:02 PM
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        //wildcard
        List<?> list = null;
        List<?> list4 = new ArrayList<>();
        list = list1;
        list = list2;
        list = list3;
        list4 = list1;
        list4 = list2;
        list4 = list3;
    }
}
