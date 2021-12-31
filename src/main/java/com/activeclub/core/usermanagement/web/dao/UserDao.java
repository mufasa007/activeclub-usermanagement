package com.activeclub.core.usermanagement.web.dao;

import com.activeclub.core.usermanagement.bean.dto.UserDto;
import com.activeclub.core.usermanagement.bean.vo.UserVo;
import com.activeclub.core.web.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 59456
 * @Date 2020/11/1 21:54
 * @Descrip 用户管理dao
 * @Version 1.0
 */
@Repository
@Mapper
public interface UserDao extends BaseDao<UserDto> {


    List<UserVo> listAll();

    Boolean checkUser(@Param("code") String code);
}
