package com.cmq.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 5:33 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("192.168.0.2",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
    }
}
