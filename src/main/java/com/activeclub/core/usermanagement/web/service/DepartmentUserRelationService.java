package com.activeclub.core.usermanagement.web.service;

import com.activeclub.core.usermanagement.bean.model.DepartmentUserRelation;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public interface DepartmentUserRelationService {

    void upsetList(List<DepartmentUserRelation> departmentUserRelationList);

    void deleteByCondition(DepartmentUserRelation departmentUserRelation);

    List<DepartmentUserRelation> selectByCondition(DepartmentUserRelation departmentUserRelation);

}
