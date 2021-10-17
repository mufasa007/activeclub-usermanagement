package com.activeclub.core.ac_usermanagement.web.dao;

import com.activeclub.core.ac_usermanagement.bean.dto.DepartmentDto;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.web.dao.BaseDao;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public interface DepartmentDao extends BaseDao<DepartmentDto> {

    Boolean checkDepartment(@Param("code") String code);
}
