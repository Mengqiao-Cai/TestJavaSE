package com.cmq.enum03;

/**
 * @author: cmq
 * @date: 9/25/2024 - 09 - 25 - 5:24 PM
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        System.out.println("--------------");
        Season[] values = Season.values();
        for (Season s:values) System.out.println(s);

    }
}
