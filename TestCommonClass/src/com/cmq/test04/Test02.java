package com.cmq.test04;

/**
 * @author: cmq
 * @date: 8/1/2024 - 08 - 01 - 6:43 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //all will become "abc" after compile
        //in the variable pool -> if there's no such string, put it, if exists, use it
        String s1 = "a" + "b" + "c";
        String s2 = "ab" + "c";
        String s3 = "a" + "bc";
        String s4 = "abc";
        String s5 = "abc" + "";
        System.out.println(s1==s2);
        System.out.println(s3==s5);

        String s6 = new String("abc");
        System.out.println(s1==s6);
    }
}
