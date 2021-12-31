package com.activeclub.core.usermanagement.web.service.impl;

import com.activeclub.core.usermanagement.bean.model.DepartmentUserRelation;
import com.activeclub.core.usermanagement.web.dao.DepartmentUserRelationDao;
import com.activeclub.core.usermanagement.web.service.DepartmentUserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public class DepartmentUserRelationServiceImpl implements DepartmentUserRelationService {

    @Autowired
    private DepartmentUserRelationDao departmentUserRelationDao;

    @Override
    @Transactional
    public void upsetList(List<DepartmentUserRelation> departmentUserRelationList) {
        departmentUserRelationDao.upsertList(departmentUserRelationList);
    }

    @Override
    @Transactional
    public void deleteByCondition(DepartmentUserRelation departmentUserRelation) {
        departmentUserRelationDao.deleteByConidtion(departmentUserRelation);
    }

    @Override
    public List<DepartmentUserRelation> selectByCondition(DepartmentUserRelation departmentUserRelation) {
        return departmentUserRelationDao.selectByCondition(departmentUserRelation);
    }
}
