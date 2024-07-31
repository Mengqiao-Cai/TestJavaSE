package com.cmq.test03;

/**
 * @author: cmq
 * @date: 7/25/2024 - 07 - 25 - 1:52 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(30,"didi");
        Girl girl = new Girl("titi",100);
        girl.love(boy);
        girl.chatMom();
    }
}
