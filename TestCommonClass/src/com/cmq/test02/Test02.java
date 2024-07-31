package com.cmq.test02;
//extends from util.Date
import java.sql.Date;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 3:18 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Date d = new Date(999999999999L);
        System.out.println(d);

        //transfer between util.date and sql.date
        java.util.Date date = new Date(999999999999L);
        //transfer below
        Date date1 = (Date) date;

        Date date2 = new Date(date.getTime());

        //sql.Date->util.Date
        java.util.Date date3 = d;

        //String->sql.Date
        Date date4 = Date.valueOf("2019-3-8");
        Date date5 = Date.valueOf("2099 -10-8");
        System.out.println(date5);

    }
}
