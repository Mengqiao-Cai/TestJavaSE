package com.cmq.test02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 4:00 PM
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        //Calendar -> abstract class
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal);

        //get
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("==========");
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_WEEK));

        //set -> change corresponding attributes in calendar
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, 3);
        System.out.println(cal);
        //String -> Calendar:
        java.sql.Date date = java.sql.Date.valueOf("2024-7-31");
        cal.setTime(date);
        System.out.println(cal);
    }
}
