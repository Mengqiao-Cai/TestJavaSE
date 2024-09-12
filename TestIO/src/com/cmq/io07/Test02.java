package com.cmq.io07;

import java.io.*;

/**
 * @author: cmq
 * @date: 9/11/2024 - 09 - 11 - 10:25 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\caime\\Desktop\\java projects\\TestObjectStream2.txt")));

        Person p = (Person) ois.readObject();
        //System.out.println(p.getName()+","+p.getAge());
        System.out.println(p.toString());
        ois.close();
    }
}
