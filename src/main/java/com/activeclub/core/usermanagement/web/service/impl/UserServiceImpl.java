package com.activeclub.core.usermanagement.web.service.impl;

import com.activeclub.core.bean.Page;
import com.activeclub.core.usermanagement.bean.dto.PasswordDto;
import com.activeclub.core.usermanagement.bean.dto.UserDto;
import com.activeclub.core.usermanagement.bean.vo.UserVo;
import com.activeclub.core.usermanagement.web.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/8/12
 * @Descrip
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void insertUser(UserDto userDto) {

    }

    @Override
    public void updateUser(UserDto userDto) {

    }

    @Override
    public void upsertUser(UserDto userDto) {

    }

    @Override
    public void updateDepartmentUserRelation(UserDto userDto) {

    }

    @Override
    public void updatePwd(PasswordDto passwordDto) {

    }

    @Override
    public void deleteUserByAccountNameList(List<String> accountNameList) {

    }

    @Override
    public UserVo getDetailsByAccountNameList(List<String> accountNameList) {
        return null;
    }

    @Override
    public Page getPageByCondition(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserVo> getDetailsByCondition(UserDto userDto) {
        return null;
    }
}
