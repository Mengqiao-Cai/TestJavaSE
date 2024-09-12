package com.cmq.io01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: cmq
 * @date: 9/10/2024 - 09 - 10 - 1:38 PM
 * @version: 1.0
 */
public class test02 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");
        FileReader fr = new FileReader(f);

        char[] ch = new char[5];
        int len = fr.read(ch); //read 5 char every time
        //buffer char array
        while (len!=-1) {
//            for (int i=0;i<len;i++) {
//                System.out.print(ch[i]+" ");
//            }
//            System.out.println();
//            len = fr.read(ch);
            String str = new String(ch,0,len);
            System.out.print(str);
            len = fr.read(ch);
        }



        fr.close();
    }
}
