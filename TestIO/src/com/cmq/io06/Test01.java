package com.cmq.io06;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 10:09 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\caime\\Desktop\\java projects\\TestObjectStream.txt")));

        oos.writeObject("hi");

        oos.close();
    }
}
