package com.activeclub.core.ac_usermanagement.web.dao;

import com.activeclub.core.ac_usermanagement.bean.model.DepartmentUserRelation;
import com.activeclub.core.web.dao.BaseDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public interface DepartmentUserRelationDao extends BaseDao<DepartmentUserRelation> {

    void deleteByConidtion(DepartmentUserRelation departmentUserRelation);

    void deleteByUserCode(@Param("userCode") String userCode);

    void deleteByDepartmentCode(@Param("departmentCode")String departmentCode);

    List<DepartmentUserRelation> selectByCondition(DepartmentUserRelation departmentUserRelation);

    void deleteByUserCodeList(@Param("userCodeList")List<String> userCodeList);

    void deleteByDepartmentCodeList(@Param("departmentCodeList")List<String> departmentCodeList);
}
