package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/28/2024 - 07 - 28 - 4:12 PM
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            Class.forName("com.cmq.test01.Test").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Class.forName("com.cmq.test01.Test").newInstance();
    }
}
