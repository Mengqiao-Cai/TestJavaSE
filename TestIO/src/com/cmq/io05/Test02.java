package com.cmq.io05;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 9:52 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\TestDataStream.txt");
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        //read type must be same as input type
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());

        dis.close();
    }
}
