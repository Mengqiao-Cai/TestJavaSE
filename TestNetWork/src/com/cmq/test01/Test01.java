package com.cmq.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 5:26 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("192.168.0.3");
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost"); //<-your machine ip address
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("LAPTOP-LBDN0PLT");
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.google.com");
        System.out.println(ia5);

        System.out.println(ia5.getHostName());
        System.out.println(ia5.getHostAddress());
    }
}
