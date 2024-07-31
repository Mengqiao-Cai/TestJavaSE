package com.cmq.test02;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 3:43 PM
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        // 1. String -> java.sql.Date
        // can only be year-month-day <- restricted
        java.sql.Date date = java.sql.Date.valueOf("2024-7-31");
        // 2. java.sql.Date -> java.util.Date
        java.util.Date date2 = date;
        System.out.println(date2);

    }
}
