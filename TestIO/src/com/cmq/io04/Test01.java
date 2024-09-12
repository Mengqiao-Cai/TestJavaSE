package com.cmq.io04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 8:30 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
//        //standard input: from keyboard
//        InputStream in = System.in;
//        //waiting for input from keyboard, blocking method
//        int n = in.read();
//        System.out.println(n);

        //
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);

        Scanner sc = new Scanner(new FileInputStream(new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt")));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}
