package com.activeclub.core.ac_usermanagement.web.service.impl;

import com.activeclub.core.bean.Page;
import com.activeclub.core.ac_usermanagement.bean.dto.PasswordDto;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.bean.vo.UserVo;
import com.activeclub.core.ac_usermanagement.web.service.UserService;
import com.activeclub.core.utils.NullUtil;
import com.activeclub.core.utils.RandomUtil;
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
    public void insert(UserDto userDto) {

    }

    @Override
    public void update(UserDto userDto) {

    }

    @Override
    public void upsert(UserDto userDto) {

    }

    @Override
    public void insertList(List<UserDto> userDtoList) {

    }

    @Override
    public void updateList(List<UserDto> userDtoList) {

    }

    @Override
    public void upsertList(List<UserDto> userDtoList) {

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
