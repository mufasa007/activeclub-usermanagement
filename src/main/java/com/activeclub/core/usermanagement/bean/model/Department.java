package com.activeclub.core.usermanagement.bean.model;

import com.activeclub.core.bean.BaseModel;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public class Department extends BaseModel {

    /**
     * 部门业务code
     */
    private String businessCode;

    /**
     * 部门简称
     */
    private String tinyName;

    /**
     * 部门全称
     */
    private String fullName;

    /**
     * 父级部门code
     */
    private String parentCode;

    /**
     * 父级部门code
     */
    private String parentbusinessCode;

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getTinyName() {
        return tinyName;
    }

    public void setTinyName(String tinyName) {
        this.tinyName = tinyName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentbusinessCode() {
        return parentbusinessCode;
    }

    public void setParentbusinessCode(String parentbusinessCode) {
        this.parentbusinessCode = parentbusinessCode;
    }
}
