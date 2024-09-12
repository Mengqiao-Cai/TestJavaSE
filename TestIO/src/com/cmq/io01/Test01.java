package com.cmq.io01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: cmq
 * @date: 9/10/2024 - 09 - 10 - 1:14 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");
        FileReader fr = new FileReader(f);

        //1.
//        int n = fr.read();
//        while (n!=-1) {
//            System.out.println(n);
//            n = fr.read();
//        }
//        System.out.println(n);

        //2.
        int n;
        while ((n=fr.read())!=-1) {
            System.out.println((char)n);
        }


        //steam, db, internet -> jvm cannot close for you, manually close it.
        fr.close();
    }
}
