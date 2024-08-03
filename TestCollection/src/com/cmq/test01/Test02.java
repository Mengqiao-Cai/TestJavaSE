package com.cmq.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: cmq
 * @date: 8/2/2024 - 08 - 02 - 8:18 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        col.add("abc");

        //iterate:
        //1. normal for
        /*for (int i=0;i<col.size();i++) {
            col.
        }*/

        //2. enforced for
        for (Object o:col) {
            System.out.println(o);
        }
        System.out.println("===========");
        //3.
        Iterator it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
