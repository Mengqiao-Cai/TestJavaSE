package com.cmq.io01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: cmq
 * @date: 9/10/2024 - 09 - 10 - 1:46 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //if target file not exist, will create such file
        //if exists -> will overwrite original file
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\TestWriter.txt");
        FileWriter fw = new FileWriter(f);
        //true -> will append to the original file
        //FileWriter fw = new FileWriter(f, true);
        String str = "hello this is third write";
//        for (int i=0;i<str.length();i++) {
//            fw.write(str.charAt(i));
//        }
        char[] chars = str.toCharArray();
        fw.write(chars);
        fw.close();
    }
}
