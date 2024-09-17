package com.cmq.test04;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 9/17/2024 - 09 - 17 - 1:37 PM
 * @version: 1.0
 */
public class TestSend {
    public static void main(String[] args) {
        System.out.println("student online");

        //porter number of sender
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("message sent by student: ");
                String str = sc.nextLine();

                byte[] bytes = str.getBytes();
                //4 parameters->
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),9999);
                ds.send(dp);

                if (str.equals("bye")) {
                    System.out.println("offline...");
                    break;
                }

                byte[] b = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(b,b.length);
                ds.receive(dp2);
                byte[] data = dp2.getData();
                String s = new String(data,0,dp2.getLength());
                System.out.println("From teacher: "+s);
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
