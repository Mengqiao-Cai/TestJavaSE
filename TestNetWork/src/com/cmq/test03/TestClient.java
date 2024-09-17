package com.cmq.test03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 8:09 PM
 * @version: 1.0
 */
public class TestClient {
    public static void main(String[] args) {
        System.out.println("client starts");
        //server side ip + port
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;
        try {
            s = new Socket("192.168.0.124", 8888);
            Scanner sc = new Scanner(System.in);
            System.out.println("input your account: ");
            String name = sc.next();
            System.out.println("input your password: ");
            String pwd = sc.next();

            User user = new User(name, pwd);

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            //receive message from server side
            is = s.getInputStream();
            dis = new DataInputStream(is);
            String str = dis.readUTF();
            System.out.println("message from server: "+str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dis!=null) dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is!=null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (oos!=null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (os!=null) os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (s!=null) s.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
