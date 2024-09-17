package com.cmq.test03;

import java.io.Serializable;

/**
 * @author: cmq
 * @date: 9/17/2024 - 09 - 17 - 12:06 AM
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5595575426931281210L;
    private String name;
    private String pwd;
    

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
