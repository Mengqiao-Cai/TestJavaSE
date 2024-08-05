package com.cmq.test01;

import java.util.ArrayList;

/**
 * @author: cmq
 * @date: 8/5/2024 - 08 - 05 - 3:56 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //create ArrayList and store grade
        ArrayList al = new ArrayList();
        al.add(98);
        al.add(18);
        al.add(60);
        al.add(83);
        al.add("what?");


        for (Object o:al) {
            System.out.println(o);
        }

        //generic: check while compile, cant contain elements <- not this class
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(23);
        al2.add(98);
        //al2.add("cantadd");
        for (Integer i:al2) {
            System.out.println(i);
        }


    }
}
