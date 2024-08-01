package com.cmq.test02;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 7:31 PM
 * @version: 1.0
 */
public class Test10 {

    public static void main(String[] args) {
        //DateTimeFormatter
        //1.
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String str = df1.format(now);
        System.out.println(str);    //"2024-07-31T19:36:12.557"

        TemporalAccessor parse = df1.parse("2024-07-31T19:36:12.557");
        System.out.println(parse);

        //2.
        //FormatStyle.LONG/FormatStyle.MEDIUM/Format.SHORT
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //LocalDateTime -> String
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);

        //String -> LocalDateTime
        TemporalAccessor parse1 = df2.parse("7/31/24 7:40 PM");
        System.out.println(parse1);

        //3. self-defined format:
        //ofPattern
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime now2 = LocalDateTime.now();
        String format = df3.format(now2);
        System.out.println(format);
        TemporalAccessor parse2 = df3.parse("2024-07-31 07:44:00");
        System.out.println(parse2);
    }
}
