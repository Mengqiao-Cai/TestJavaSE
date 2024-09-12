package com.cmq.io01;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/10/2024 - 09 - 10 - 3:23 PM
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //source file
        File f1 = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");
        File f2 = new File("C:\\Users\\caime\\Desktop\\java projects\\TestCopy.txt");

        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);

//        int n = fr.read();
//        while (n!=-1) {
//            fw.write((char)n);
//            n = fr.read();
//        }

//        char[] ch = new char[5];
//        int len = fr.read(ch);
//        while (len!=-1) {
//            fw.write(ch,0,len);
//            len = fr.read(ch);
//        }

        char[] ch = new char[5];
        int len = fr.read(ch);
        while (len!=-1) {
            String s = new String(ch,0,len);
            fw.write(s);
            len = fr.read(ch);
        }



        //later use, first close
        fw.close();
        fr.close();
    }
}
