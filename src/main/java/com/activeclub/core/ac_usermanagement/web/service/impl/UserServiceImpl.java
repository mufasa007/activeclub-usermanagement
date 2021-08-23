package com.activeclub.core.ac_usermanagement.web.service.impl;

import com.activeclub.core.ac_usermanagement.bean.dto.PasswordDto;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.bean.model.User;
import com.activeclub.core.ac_usermanagement.bean.vo.UserVo;
import com.activeclub.core.ac_usermanagement.web.dao.UserDao;
import com.activeclub.core.ac_usermanagement.web.service.UserService;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.bean.Page;
import org.postgresql.util.PSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.activeclub.core.constants.ErrorCode.DB_UINDEX_ERROR;

/**
 * @Author 59456
 * @Date 2021/8/12
 * @Descrip
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public void insert(UserDto userDto) throws BaseException{
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        try {
            userDao.insert(user);
        }catch (DuplicateKeyException duplicateKeyException){
            if(duplicateKeyException.getMessage().contains("user_code_uindex")){
                logger.error(String.format(
                        "errorCode:%s,msg:%s,exception:%s",
                        DB_UINDEX_ERROR.code,"数据重复",
                        "duplicate key value violates user_code_uindex"));
                throw new BaseException(DB_UINDEX_ERROR.code,"");
            }else if(duplicateKeyException.getMessage().contains("user_code_uindex")){
                logger.error(String.format(
                        "errorCode:%s,msg:%s,exception:%s",
                        DB_UINDEX_ERROR.code,"数据重复",
                        "duplicate key value violates user_code_uindex"));
                throw new BaseException(DB_UINDEX_ERROR.code,"");
            }
        }catch (Exception e){
            throw new BaseException(DB_UINDEX_ERROR.code,"");
        }


    }

    @Override
    public void update(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userDao.update(user);
    }

    @Override
    public void upsert(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userDao.upsert(user);
    }

    @Override
    public void insertList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.insertList(userList);
    }

    @Override
    public void updateList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.updateList(userList);
    }

    @Override
    public void upsertList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.upsertList(userList);
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
