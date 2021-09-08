package com.activeclub.core.ac_usermanagement.web.service.impl;

import com.activeclub.core.ac_usermanagement.bean.dto.DepartmentDto;
import com.activeclub.core.ac_usermanagement.web.dao.DepartmentDao;
import com.activeclub.core.ac_usermanagement.web.service.DepartmentService;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.bean.Page;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

import java.util.List;

import static com.activeclub.core.constants.ErrorCode.DB_UINDEX_ERROR;

/**
 * @Author 59456
 * @Date 2021/9/8
 * @Descrip
 * @Version 1.0
 */
public class DepartmentServiceImpl implements DepartmentService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void insert(DepartmentDto departmentDto) {
        try {
            departmentDao.insert(departmentDto);
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
    public void delete(String s) {

    }

    @Override
    public void update(DepartmentDto departmentDto) {

    }

    @Override
    public void upsert(DepartmentDto departmentDto) {

    }

    @Override
    public void insertList(List<DepartmentDto> list) {

    }

    @Override
    public void deleteList(List<String> list) {

    }

    @Override
    public void updateList(List<DepartmentDto> list) {

    }

    @Override
    public void upsertList(List<DepartmentDto> list) {

    }

    @Override
    public Object detail(String s) {
        return null;
    }

    @Override
    public List<?> detailList(List<String> list) {
        return null;
    }

    @Override
    public Page findByPage(DepartmentDto departmentDto) {
        return null;
    }
}
