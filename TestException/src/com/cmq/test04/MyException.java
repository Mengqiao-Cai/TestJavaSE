package com.cmq.test04;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 5:22 PM
 * @version: 1.0
 */
public class MyException extends RuntimeException{
    static final long serialVersionUID = -70348971939L;
    public MyException() {

    }
    public MyException(String msg) {
        super(msg);
    }
}
