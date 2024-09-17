package com.cmq.test03;

import java.io.*;
import java.net.Socket;

/**
 * @author: cmq
 * @date: 9/17/2024 - 09 - 17 - 12:32 AM
 * @version: 1.0
 */
public class ServerThread extends Thread {
    InputStream is = null;
    ObjectInputStream ois = null;
    OutputStream os = null;
    DataOutputStream dos = null;
    Socket s = null;
    public ServerThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try{
            //2.等着客户端发来的信息：
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
            //4.读取客户端发来的数据：
            User user = (User)(ois.readObject());
            //对对象进行验证：
            boolean flag = false;
            if(user.getName().equals("magiccode")&&user.getPwd().equals("123456")){
                flag = true;
            }
            //向客户端输出结果：---》操作流---》输出流
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            if (flag) dos.writeUTF("successfully log in");
            else dos.writeUTF("fail to log in");
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

