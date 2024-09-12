package com.cmq.io03;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 5:28 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");
        FileInputStream fis = new FileInputStream(f);
        //InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        InputStreamReader isr = new InputStreamReader(fis);
        char[] ch = new char[20];
        int len = isr.read(ch);
        while (len!=-1) {
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }

        isr.close();
    }
}
