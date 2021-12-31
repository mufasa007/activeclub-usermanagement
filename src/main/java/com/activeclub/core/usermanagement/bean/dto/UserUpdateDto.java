package com.activeclub.core.usermanagement.bean.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author 59456
 * @Date 2021/8/17
 * @Descrip
 * @Version 1.0
 */
public class UserUpdateDto implements Serializable {

    private static final long serialVersionUID = 6111043068008905109L;
    @NotBlank(message = "user code can't be null ! ")
    private String code;

    private String password;
    private String phoneNumber;
    private String identityNumber;
    private String name;

    private Short originType;
    private Short infoLevel;
    private String attributeJson;
    private String comment;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getOriginType() {
        return originType;
    }

    public void setOriginType(Short originType) {
        this.originType = originType;
    }

    public Short getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(Short infoLevel) {
        this.infoLevel = infoLevel;
    }

    public String getAttributeJson() {
        return attributeJson;
    }

    public void setAttributeJson(String attributeJson) {
        this.attributeJson = attributeJson;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }
}
