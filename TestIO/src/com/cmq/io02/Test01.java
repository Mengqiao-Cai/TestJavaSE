package com.cmq.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 1:56 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");

        FileInputStream fis = new FileInputStream(f);

        int n = fis.read();
        //utf-8
        //if word based file, don't use byte stream to read
        while (n!=-1) {
            System.out.println(n);
            //read -> positive numbers
            n = fis.read();
        }

        fis.close();
    }
}
