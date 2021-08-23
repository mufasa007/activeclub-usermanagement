package com.activeclub.core.ac_usermanagement.web.service;

import com.activeclub.core.ac_usermanagement.bean.model.User;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.bean.Page;
import com.activeclub.core.ac_usermanagement.bean.dto.PasswordDto;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.bean.vo.UserVo;

import java.util.List;

/**
 * @Author 59456
 * @Date 2021/8/11
 * @Descrip
 * @Version 1.0
 */
public interface UserService {

    void insert(UserDto userDto) throws BaseException;
    void update(UserDto userDto);
    void upsert(UserDto userDto);

    void insertList(List<UserDto> userDtoList);
    void updateList(List<UserDto> userDtoList);
    void upsertList(List<UserDto> userDtoList);

    void updateDepartmentUserRelation(UserDto userDto);
    void updatePwd(PasswordDto passwordDto);

    void deleteUserByAccountNameList(List<String> accountNameList);

    UserVo getDetailsByAccountNameList(List<String> accountNameList);

    Page getPageByCondition(UserDto userDto);

    List<UserVo> getDetailsByCondition(UserDto userDto);

    List<UserVo> listAll();

    void delete(String accountName);
}
