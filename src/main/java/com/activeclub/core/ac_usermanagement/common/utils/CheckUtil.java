package com.activeclub.core.ac_usermanagement.common.utils;

import com.activeclub.core.ac_usermanagement.bean.dto.DepartmentDto;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.web.dao.DepartmentDao;
import com.activeclub.core.ac_usermanagement.web.dao.UserDao;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.constants.ErrorCode;
import com.activeclub.core.constants.NormalConstants;
import com.activeclub.core.utils.EncrytUtil;
import com.activeclub.core.utils.NullUtil;
import com.activeclub.core.utils.RandomUtil;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author 59456
 * @Date 2021/8/15
 * @Descrip
 * @Version 1.0
 */
@Component
public class CheckUtil {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDao userDao;

    @Autowired
    private DepartmentDao departmentDao;

    public void departmentUpdate(DepartmentDto departmentDto) {
        // 非空校验
        if(departmentDto == null){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input department data is null! ");
        }

        // code为空则自动生成
        if(NullUtil.strIsNull(departmentDto.getCode())){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input department's code is null! ");
        }

        Boolean flag =  departmentDao.checkDepartment(departmentDto.getCode());
        if(flag){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "user's code is null in db ");
        }
    }

    public void departmentInsert(DepartmentDto departmentDto) {

    }


    public void userUpdate(UserDto userDto) {

        // 非空校验
        if(userDto == null){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input user data is null! ");
        }

        // code为空则自动生成
        if(NullUtil.strIsNull(userDto.getCode())){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input user's code is null! ");
        }

        Boolean flag =  userDao.checkUser(userDto.getCode());
        if(flag){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "user's code is null in db ");
        }

    }

    public void userInsert(UserDto userDto) throws BaseException {
        // 非空校验
        if(userDto == null){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input user data is null! ");
        }

        // code为空则自动生成
        if(NullUtil.strIsNull(userDto.getCode())){
            userDto.setCode(RandomUtil.getRandomCode());
        }

        // 账户名称
        if(NullUtil.strIsNull(userDto.getName())){
            throw new BaseException(ErrorCode.PARAM_NULL.code, "input user's name is null! ");
        }

        // 密码
        if(NullUtil.strIsNull(userDto.getPassword())){
            userDto.setPassword(PasswordUtil.generatePassword());
        }

        // 电话号码
        if(NullUtil.strIsNull(userDto.getPhoneNumber())){
            userDto.setPhoneNumber("1582" + RandomUtil.getRandomCode());
        }

        // 身份证号
        if(NullUtil.strIsNull(userDto.getPhoneNumber())){
            userDto.setIdentityNumber("420621" + RandomUtil.getRandomCode());
        }

//        // 数据来源(数据库有默认值)
//        if(null == userDto.getOriginType()){
//            userDto.setOriginType(NormalConstants.ORIGIN_TYPE_OURSELF);
//        }
//
//        // 信息级别(数据库有默认值)
//        if(null == userDto.getInfoLevel()){
//            userDto.setInfoLevel(new Short("50"));
//        }


    }

}
