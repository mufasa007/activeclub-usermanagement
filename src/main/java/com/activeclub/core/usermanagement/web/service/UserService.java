package com.activeclub.core.usermanagement.web.service;

import com.activeclub.core.bean.Page;
import com.activeclub.core.usermanagement.bean.dto.PasswordDto;
import com.activeclub.core.usermanagement.bean.dto.UserDto;
import com.activeclub.core.usermanagement.bean.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public interface UserService {

    void insertUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void upsertUser(UserDto userDto);
    void updateDepartmentUserRelation(UserDto userDto);
    void updatePwd(PasswordDto passwordDto);

    void deleteUserByAccountNameList(List<String> accountNameList);

    UserVo getDetailsByAccountNameList(List<String> accountNameList);

    Page getPageByCondition(UserDto userDto);

    List<UserVo> getDetailsByCondition(UserDto userDto);
}
