package com.cmq.test02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 6:26 PM
 * @version: 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        //implementation
        //1 -> now()
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //2 -> of()
        LocalDate localDate1 = LocalDate.of(2024, 7, 31);
        LocalTime localTime1 = LocalTime.of(6, 28, 4);
        LocalDateTime localDateTime1 = LocalDateTime.of(1999, 5, 22, 23, 23, 23);
        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);

        //most used -> LocalDateTime
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getSecond());

        //not set -> with
        //not changing original LocalDateTime onject
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //plus or minus
        LocalDateTime plus = localDateTime.plusMonths(3);
        System.out.println(plus);
        LocalDateTime localDateTime3 = localDateTime.minusMonths(5);
        System.out.println(localDateTime3);
    }
}
