package com.activeclub.core.usermanagement.bean.model;

import com.activeclub.core.bean.BaseModel;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public class User extends BaseModel{

    /**
     * 唯一键
     */
    private String accountName;

    /**
     * 登录密码密文
     */
    private String password;

    /**
     * 可重复(显示名)
     */
    private String userName;

    /**
     * 非必填，存在默认值
     */
    private String phoneNumber;

    /**
     * 非必填，但是不可重复
     */
    private String identityNumber;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
