package com.activeclub.core.ac_usermanagement.web.service.impl;

import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.bean.model.User;
import com.activeclub.core.ac_usermanagement.web.dao.UserDao;
import com.activeclub.core.ac_usermanagement.web.service.UserService;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.bean.Page;
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
    public void insert(UserDto userDto) {
        User user = new User();
//        BeanUtils.copyProperties(userDto, user);
        try {
            userDao.insert(userDto);
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
    public void insertList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.insertList(userDtoList);
    }

    @Override
    public void delete(String accountName) {
        userDao.delete(accountName);
    }

    @Override
    public void deleteList(List<String> accountNameList) {
        userDao.deleteList(accountNameList);
    }

    @Override
    public void update(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userDao.update(userDto);
    }

    @Override
    public void updateList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.updateList(userDtoList);
    }

    @Override
    public void upsert(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userDao.upsert(userDto);
    }

    @Override
    public void upsertList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>(userDtoList.size());
        userDtoList.forEach(entity->{
            User user = new User();
            BeanUtils.copyProperties(entity, user);
            userList.add(user);
        });
        userDao.upsertList(userDtoList);
    }


    @Override
    public UserDto detail(String accountName) {
        return userDao.detail(accountName);
    }

    @Override
    public List<?> detailList(List<String> accountNameList) {
        return userDao.detailList(accountNameList);
    }

    @Override
    public Page findByPage(UserDto userDto) {
        Integer pageNum = userDto.getPageNum();
        Integer pageSize = userDto.getPageSize();
        if(pageNum == null || pageNum<1){
            pageNum = 1;
            userDto.setPageNum(pageNum);
        }
        if(pageSize == null || pageSize<1){
            pageSize = 10;
            userDto.setPageSize(pageSize);
        }

        Page page = new Page();
        Integer count = userDao.findCountByPage(userDto);
        if(count== 0 || count <1){
            page.setTotalNum(0);
            page.setTotalSize(0);
            return page;
        }

        page.setTotalSize(count);
        Integer totalNum = count / pageSize + (count % pageSize > 0 ? 1 : 0);
        page.setTotalNum(totalNum);
        Integer offset = pageSize * (pageNum-1);
        userDto.setOffset(offset);

        List<?> userList = userDao.findByPage(userDto);
        page.setData(userList);
        return page;
    }


}
