package com.cmq.test10;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 11:38 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //binary search tree
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(7);
        ts.add(9);
        ts.add(3);
        ts.add(16);
        System.out.println(ts.size());
        //sorted, using inner comparator
        System.out.println(ts);
    }
}
