package com.cmq.io05;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 9:47 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\TestDataStream.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("hii");
        dos.writeBoolean(false);
        dos.writeDouble(6.9);
        dos.writeInt(82);

        dos.close();
    }
}
