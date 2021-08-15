package com.activeclub.core.ac_usermanagement.bean.dto;

import com.activeclub.core.ac_usermanagement.bean.model.User;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author 59456
 * @Date 2021/8/12
 * @Descrip
 * @Version 1.0
 */
public class UserDto extends User implements Serializable {
    private static final long serialVersionUID = 8051403571365757931L;

    private Long id;
    private Long flag;

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
    private Date creatTime;
    private Date updateTime;
    private String creator;
    private String modifier;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getFlag() {
        return flag;
    }

    @Override
    public void setFlag(Long flag) {
        this.flag = flag;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getIdentityNumber() {
        return identityNumber;
    }

    @Override
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Short getOriginType() {
        return originType;
    }

    @Override
    public void setOriginType(Short originType) {
        this.originType = originType;
    }

    @Override
    public Short getInfoLevel() {
        return infoLevel;
    }

    @Override
    public void setInfoLevel(Short infoLevel) {
        this.infoLevel = infoLevel;
    }

    @Override
    public String getAttributeJson() {
        return attributeJson;
    }

    @Override
    public void setAttributeJson(String attributeJson) {
        this.attributeJson = attributeJson;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public Date getCreatTime() {
        return creatTime;
    }

    @Override
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String getModifier() {
        return modifier;
    }

    @Override
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String getExt1() {
        return ext1;
    }

    @Override
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    @Override
    public String getExt2() {
        return ext2;
    }

    @Override
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    @Override
    public String getExt3() {
        return ext3;
    }

    @Override
    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    @Override
    public String getExt4() {
        return ext4;
    }

    @Override
    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    @Override
    public String getExt5() {
        return ext5;
    }

    @Override
    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }
}
