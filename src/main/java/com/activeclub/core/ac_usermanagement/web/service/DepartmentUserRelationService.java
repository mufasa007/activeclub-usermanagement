package com.activeclub.core.ac_usermanagement.web.service;

import com.activeclub.core.ac_usermanagement.bean.model.DepartmentUserRelation;
import com.activeclub.core.web.service.BaseService;

import java.util.List;
import java.util.Map;

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
