package com.activeclub.core.ac_usermanagement.common.utils;

import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.constants.ErrorCode;
import com.activeclub.core.utils.EncrytUtil;
import com.activeclub.core.utils.NullUtil;
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

//    @Autowired
//    private EncrytUtil encrytUtil;

    public void userInsert(UserDto userDto) throws BaseException {
        if(NullUtil.strIsNull(userDto.getPassword())){
            throw new BaseException(ErrorCode.PARAM_NULL.code,
                    String.format("Password %s",ErrorCode.PARAM_NULL.msg));
        }

        EncrytUtil encrytUtil= new EncrytUtil();
        try{
            String ciper = encrytUtil.Decode(userDto.getPassword(),"","");
        }catch (Exception e){
            throw new BaseException(ErrorCode.PARAM_DECODE.code,
                    String.format("Password %s",ErrorCode.PARAM_DECODE.msg));
        }
    }

}
