package com.cmq.test04;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author: cmq
 * @date: 8/1/2024 - 08 - 01 - 4:59 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[]{'a','b','c'});

        String s4 = "abc";
        System.out.println(s4.length());

        String s5 = new String();
        System.out.println(s5.isEmpty());
        System.out.println(s4.charAt(2));

        String s6 = new String("abc");
        String s7 = "abc";
        System.out.println(s6.equals(s7));
        //compareTo()->return first not equal char (char1-char2) || difference in length
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo("a"));

        //substring
        String s10 = "abcdefhijk";
        //from index i to the end
        System.out.println(s10.substring(3));
        //from index [i,j)
        System.out.println(s10.substring(3,6));

        //concat -> put 2 str together
        System.out.println(s10.concat("pppp"));
        System.out.println(s10);

        //replace old char by new char
        String s11 = "abcadefaghi";
        System.out.println(s11.replace('a','u'));

        //split()
        String s12 = "a-b-c-d-e-f";
        String[] strs = s12.split("-");
        System.out.println(Arrays.toString(strs));
        System.out.println(s12);

        String s13 = "abc";
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toUpperCase().toLowerCase());

        //trim -> get rid of space at the end and tail
        String s14 = "   a  b  c   ";
        System.out.println(s14.trim());

        String s15 = "abc";
        System.out.println(s15.toString());

        System.out.println(String.valueOf(true));
    }
}
