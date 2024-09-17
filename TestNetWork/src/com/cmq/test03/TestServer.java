package com.cmq.test03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: cmq
 * @date: 9/16/2024 - 09 - 16 - 8:13 PM
 * @version: 1.0
 */
public class TestServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;//定义一个计数器，用来计数  客户端的请求
        try {
            ss = new ServerSocket(8888);
            while (true) {//加入死循环，服务器一直监听客户端是否发送数据
                s = ss.accept();//阻塞方法:等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行。
                //每次过来的客户端的请求 靠 线程处理：
                new ServerThread(s).start();
                count++;
                //输入请求的客户端的信息：
                System.out.println("this is No." + count + " user, this user account is：" + s.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
