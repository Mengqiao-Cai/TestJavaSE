package com.cmq.test02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 4:10 PM
 * @version: 1.0
 */
public class ExciseCalendar {
    public static void main(String[] args) {
        System.out.println("Input a date: (following format as YEAR-MONTH-DAY) ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        java.sql.Date date = java.sql.Date.valueOf(s);
        Calendar cal = new GregorianCalendar();

        cal.setTime(date);
        int curDay = cal.get(Calendar.DATE);
        cal.set(Calendar.DATE, 1);
        int firstWeekday = cal.get(Calendar.DAY_OF_WEEK);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(cal.get(Calendar.DATE)+"days" + days +"firstWeekDay"+firstWeekday);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for (int i=1;i<firstWeekday;i++){
            System.out.print("\t");
        }
        int tempDay = 1;
        for (int i=1;i<=8-firstWeekday;i++) {
            if (tempDay == curDay) {
                System.out.print(tempDay + "*" + "\t");
            } else {
                System.out.print(tempDay + "\t");
            }
            tempDay++;
        }

        outer: while (tempDay <= days) {
            System.out.print("\n");
            for (int i=0;i<7;i++) {
                if (tempDay > days) {
                    break outer;
                }
                if (tempDay == curDay) {
                    System.out.print(tempDay + "*" + "\t");
                } else {
                    System.out.print(tempDay + "\t");
                }
                tempDay++;
            }
        }
    }
}
