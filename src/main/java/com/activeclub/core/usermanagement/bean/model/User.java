package com.activeclub.core.usermanagement.bean.model;

import com.activeclub.core.bean.BaseModel;

import java.io.Serializable;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public class User extends BaseModel implements Serializable {
    private static final long serialVersionUID = 7400006197800489372L;

    /**
     * 登录密码密文
     */
    private String password;

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
