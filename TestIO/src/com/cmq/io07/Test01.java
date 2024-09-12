package com.cmq.io07;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 10:18 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Person p = new Person("lili", 19);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\caime\\Desktop\\java projects\\TestObjectStream2.txt")));
        oos.writeObject(p);

        oos.close();
    }
}
