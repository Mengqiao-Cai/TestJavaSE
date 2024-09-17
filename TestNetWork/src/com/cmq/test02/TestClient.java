package com.cmq.test02;

import java.io.*;
import java.net.Socket;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 8:09 PM
 * @version: 1.0
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        //server side ip + port
        Socket s = new Socket("192.168.0.124", 8888);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //outputstream can send data, but no method to directly send string
        dos.writeUTF("hiii");

        //receive message from server side
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("message from server: "+str);

        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
