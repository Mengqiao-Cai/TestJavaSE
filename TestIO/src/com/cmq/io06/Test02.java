package com.cmq.io06;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 10:11 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\caime\\Desktop\\java projects\\TestObjectStream.txt")));

        String s = (String)ois.readObject();
        System.out.println(s);
        ois.close();
    }
}
