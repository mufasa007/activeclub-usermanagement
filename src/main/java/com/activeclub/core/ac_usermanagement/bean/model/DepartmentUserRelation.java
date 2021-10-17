package com.activeclub.core.ac_usermanagement.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 59456
 * @Date 2021/8/13
 * @Descrip
 * @Version 1.0
 */
public class DepartmentUserRelation implements Serializable {
    private static final long serialVersionUID = 2715133905169897113L;
    private Long id;
    private Long flag;
    private String departmentCode;
    private String userCode;
    private Short type;
    private Date createTime;
    private Date updateTime;
    private String creator;
    private String modifier;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
