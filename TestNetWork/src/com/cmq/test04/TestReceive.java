package com.cmq.test04;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 9/17/2024 - 09 - 17 - 1:44 PM
 * @version: 1.0
 */
public class TestReceive {
    public static void main(String[] args) {
        System.out.println("teacher online");
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            while (true) {
                byte[] b = new byte[1024];
                DatagramPacket dp = new DatagramPacket(b,b.length);

                ds.receive(dp);
                byte[] data = dp.getData();
                String s = new String(data,0,dp.getLength()); //effective length
                if (s.equals("bye")) {
                    System.out.println("student offline...");
                    break;
                }
                System.out.println("From student: "+s);

                Scanner sc = new Scanner(System.in);
                System.out.print("message sent by teacher: ");
                String str = sc.nextLine();
                byte[] bytes = str.getBytes();
                DatagramPacket dp2 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),8888);
                ds.send(dp2);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert ds != null;
            ds.close();
        }




    }
}
