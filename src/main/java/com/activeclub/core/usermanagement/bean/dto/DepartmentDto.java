package com.activeclub.core.usermanagement.bean.dto;

import com.activeclub.core.usermanagement.bean.model.DepartmentUserRelation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public class DepartmentDto implements Serializable {
    private static final long serialVersionUID = 7604899326199042779L;

    List<DepartmentUserRelation> departmentUserRelationList;
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

    private Long id;
    private Long flag;
    private String code;
    private String tenantCode;
    private String name;
    private Short originType;
    private Short infoLevel;
    private String attributeJson;
    private String comment;
    private Date createTime;
    private Date updateTime;
    private String creator;
    private String modifier;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;

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

    public List<DepartmentUserRelation> getDepartmentUserRelationList() {
        return departmentUserRelationList;
    }

    public void setDepartmentUserRelationList(List<DepartmentUserRelation> departmentUserRelationList) {
        this.departmentUserRelationList = departmentUserRelationList;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
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
