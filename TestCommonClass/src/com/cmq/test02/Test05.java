package com.cmq.test02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cmq
 * @date: 7/31/2024 - 07 - 31 - 3:47 PM
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        //SimpleDateFormat extends DateFormat
        //->define the format
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String -> Date
        try {
            Date d = df.parse("2024-7-31 15:52:24");
            System.out.println(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //Date -> String
        String format = df.format(new Date());
        //transfer with the format I defined
        System.out.println(format);

        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

    }
}
