package com.activeclub.core.ac_usermanagement.bean.model;

import com.activeclub.core.bean.BaseModel;

import java.io.Serializable;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public class Department extends BaseModel implements Serializable {
    private static final long serialVersionUID = 3415556416458407092L;

    /**
     * 部门全称
     */
    private String fullName;

    /**
     * 父级部门code:0顶级部门
     */
    private String parentCode;

    /**
     * 部门位置
     */
    private String location;

    /**
     * 部门层级
     */
    private Short hierarchy;

    /**
     * 同层级显示顺序
     */
    private Short sort;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Short getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Short hierarchy) {
        this.hierarchy = hierarchy;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
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


}
