package com.cmq.test02;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 8:13 PM
 * @version: 1.0
 */
public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept(); //block method

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        String str = dis.readUTF();
        System.out.println("client's message: "+str);

        //send to client
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hi, this is server side, your message is received");

        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
