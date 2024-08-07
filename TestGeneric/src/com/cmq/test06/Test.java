package com.cmq.test06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cmq
 * @date: 8/6/2024 - 08 - 06 - 3:59 PM
 * @version: 1.0
 */
public class Test {
    //cant overload like this
/*    public void a(List<Object> list) {

    }
    public void a(List<String> list) {

    }*/

    public void a(List<?> list) {
        //iterate
        for (Object a:list) {
            System.out.println(a);
        }
        //write
        //list.add("abc");
        list.add(null);

        //read
        Object o = list.get(0);

    }

}

class T {
    public static void main(String[] args) {
        Test t = new Test();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());
    }
}
