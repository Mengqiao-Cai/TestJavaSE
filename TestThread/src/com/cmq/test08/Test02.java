package com.cmq.test08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cmq
 * @date: 9/13/2024 - 09 - 13 - 12:49 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(d);
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while(true) {
            Date d = new Date();
            System.out.println(df.format(d));
            Thread.sleep(1000);
        }

    }
}
