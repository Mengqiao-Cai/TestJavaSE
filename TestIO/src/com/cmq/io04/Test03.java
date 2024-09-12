package com.cmq.io04;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 8:45 PM
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\TestIODemo.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        String s = br.readLine();
        while (!s.equals("exit")) {
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        bw.close();
        br.close();
    }
}
