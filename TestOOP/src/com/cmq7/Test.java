package com.cmq7;

import com.cmq2.Person;

import java.util.ArrayList;
import java.util.HashMap;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;*/
import java.util.*;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 9:16 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);//after import, if want to use same name's class, need to specify location
        new Demo();//under same folder, doesn't need to import

        System.out.println(Math.random());
        //you can direct use class under java.lang, doesn't need to import
        new ArrayList<>();
        new HashMap<>();
    }
}
