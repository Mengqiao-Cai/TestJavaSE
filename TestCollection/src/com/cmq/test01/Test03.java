package com.cmq.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: cmq
 * @date: 8/2/2024 - 08 - 02 - 8:33 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /*
         * List common methods:
         * add: add(int index)
         * delete: remove(int index)
         * modify: set(int index, E element)
         * check: get()
         * if:
         */

        List list = new ArrayList();
        list.add(13);
        list.add(6);
        list.add(-1);
        list.add(17);
        list.add(2);
        System.out.println(list);

        list.add(3,66);
        System.out.println(list);
        list.set(3,77);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(new Integer(2));
        System.out.println(list);

        Object o = list.get(0);
        System.out.println(o);

        System.out.println("====================");
        //for:
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("====================");
        for (Object obj:list) {
            System.out.print(obj+",");
        }
        System.out.println();
        System.out.println("====================");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
