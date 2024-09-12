package com.cmq.io02;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 4:41 PM
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\caime\\Desktop\\java projects\\Test.txt");
        File f2 = new File("C:\\Users\\caime\\Desktop\\java projects\\TestCopyBuffer.txt");

        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

//        char[] ch = new char[64];
//        int n = br.read(ch);
//        while (n!=-1) {
//            bw.write(ch,0,n);
//            n = br.read();
//        }
        String str = br.readLine();
        while (str!=null) {
            bw.write(str);
            //new line
            bw.newLine();
            str = br.readLine();
        }

        bw.close();
        br.close();

    }
}
