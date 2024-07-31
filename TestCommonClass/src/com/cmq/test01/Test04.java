package com.cmq.test01;

import java.sql.SQLOutput;

/**
 * @author: cmq
 * @date: 7/30/2024 - 07 - 30 - 5:32 PM
 * @version: 1.0
 */
public class Test04 {

    public static void main(String[] args) {
        //compareTo:
        Integer i1 = new Integer(19);
        Integer i2 = new Integer(12);
        System.out.println(i1.compareTo(i2));
        //equals
        Integer i3 = new Integer(4);
        Integer i4 = new Integer(4);
        System.out.println(i3==i4);
        int a1 = 4, a2 = 4;
        System.out.println(a1==a2);
        boolean flag = i3.equals(i4);
        System.out.println(flag);

        //valueOf
        Integer i5 = 130;
        Integer i6 = 130;
        System.out.println(i5.equals(i6));
        System.out.println(i5==i6);

        //intValue()
        Integer i7 = 130;
        int i = (int) i7;
        System.out.println(i);

        //parseInt(String s)
        int i8 = Integer.parseInt("12");

        //toString:
        Integer i10 = 130;
        System.out.println(i10.toString());
    }
}
