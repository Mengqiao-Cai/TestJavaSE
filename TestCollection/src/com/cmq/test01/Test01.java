package com.cmq.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author: cmq
 * @date: 8/2/2024 - 08 - 02 - 8:01 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        * Collection common methods:
        * add: add(), addAll()
        * delete: clear(), remove()
        * modify:
        * check: iterator(), size()
        * if: contains(), equals(), isEmpty()
        */
        //interface cannot be implmented as an object, use implmented class to do it
        Collection col =new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        System.out.println(col);

        List list = Arrays.asList(new Integer[]{11, 15, 15, 3, 6, 1});
        col.addAll(list);
        System.out.println(col);

        //col.clear();
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());

        System.out.println(col.remove(15));
        System.out.println(col);

        Collection col2 = Arrays.asList(new Integer[]{18, 12, 11, 17, 11, 15, 3, 6, 1});
        System.out.println(col2.equals(col));
        System.out.println(col2==col);

        System.out.println(col2.contains(17));
        System.out.println(col2.contains(117));
    }
}
