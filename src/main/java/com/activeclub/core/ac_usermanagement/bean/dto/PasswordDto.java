package com.activeclub.core.ac_usermanagement.bean.dto;

import java.io.Serializable;

/**
 * @Author 59456
 * @Date 2021/8/12
 * @Descrip
 * @Version 1.0
 */
public class PasswordDto implements Serializable {
    private static final long serialVersionUID = -5850420495217858995L;

    private String accountName;
    private String password;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
