package com.cmq.test05;

/**
 * @author: cmq
 * @date: 8/1/2024 - 08 - 01 - 8:19 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(3);
        StringBuilder sb3 = new StringBuilder("abc");
        sb3.append("def");
        System.out.println(sb3);
        sb3.append("aaaaaaaa").append("bbb").append("oooooo");
        System.out.println(sb3);

        System.out.println(sb.append("abc") == sb.append("def"));
        System.out.println(sb);
    }
}
