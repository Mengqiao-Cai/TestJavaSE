package com.cmq.test04;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: cmq
 * @date: 8/6/2024 - 08 - 06 - 8:34 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("bbb");
        list.add("fff");
        System.out.println(list);
        list.addFirst("jj");
        list.addLast("hh");
        System.out.println(list);
        list.offer("kk");//add at the end
        System.out.println(list);
        list.offerFirst("pp");
        list.offerLast("rr");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

        //normal for?
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }

        //enhanced for?
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("--------");
        //iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------");
        //this is better -> it2 is only local inside for loop -> save cache
        for (Iterator<String> it2 = list.iterator(); it2.hasNext();) {
            System.out.println(it2.next());
        }

        list.clear();
        System.out.println(list);
        System.out.println(list.pollFirst()); //<-null
        System.out.println(list.removeFirst()); //<-exception

    }
}
