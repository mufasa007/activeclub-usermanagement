package com.activeclub.core.ac_usermanagement.web.controller;


import com.activeclub.core.ac_usermanagement.Application;
import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.bean.BaseResponse;
import com.activeclub.core.web.controller.BaseController;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author 59456
 * @Date 2020/11/1 23:45
 * @email
 * @Descrip 用户管理接口 crud
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserControllerTest extends BaseController {

    @Autowired
    private UserController userController;

    @Test
    public void insertUserTest() {
        String jsonObject = "{\n" +
                "    \"attributeJson\":\"string\",\n" +
                "    \"code\":\"0001\",\n" +
                "    \"comment\":\"备注\",\n" +
                "    \"creator\":\"万雨管理员test\",\n" +
                "    \"departmentUserRelationList\":[\n" +
                "        {\n" +
                "            \"departmentCode\":\"0001\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"departmentCode\":\"0002\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"ext1\":\"和骄傲时刻的和接口\",\n" +
                "    \"ext2\":\"打发第三方\",\n" +
                "    \"ext3\":\"干发鬼地方\",\n" +
                "    \"ext4\":\"回复稿\",\n" +
                "    \"ext5\":\"还有记忆教育厅\",\n" +
                "    \"identityNumber\":\"42062119960729743X\",\n" +
                "    \"infoLevel\":100,\n" +
                "    \"modifier\":\"\",\n" +
                "    \"name\":\"万雨\",\n" +
                "    \"offset\":0,\n" +
                "    \"originType\":0,\n" +
                "    \"pageNum\":0,\n" +
                "    \"pageSize\":0,\n" +
                "    \"password\":\"\",\n" +
                "    \"phoneNumber\":\"15827323800\"\n" +
                "}";
        UserDto userDto = JSONObject.parseObject(jsonObject, UserDto.class);
        userController.insertUser(userDto);
    }

//    @Test
//    public BaseResponse insertUser() {
//        userService.insertList(userDtoList);
//        return success();
//    }

//    @Test
//    public BaseResponse delete(@RequestParam String accountName) {
//        userService.delete(accountName);
//        return success();
//    }

//    @ApiOperation(value = "1.2.2,批量删除用户")
//    @PostMapping(value = "deleteList")
//    public BaseResponse deleteList(@RequestBody List<String> accountNameList) {
//        userService.deleteList(accountNameList);
//        return success();
//    }

//    @ApiOperation(value = "1.3.1,更新用户")
//    @PostMapping(value = "update")
//    public BaseResponse delete(@RequestBody UserDto userDto) {
//        userService.update(userDto);
//        return success();
//    }
//
//    @ApiOperation(value = "1.3.2,批量更新用户")
//    @PostMapping(value = "updateList")
//    public BaseResponse updateList(@RequestBody List<UserDto> userDtoList) {
//        userService.updateList(userDtoList);
//        return success();
//    }
//
//    @ApiOperation(value = "1.4.1,新增、更新用户")
//    @PostMapping(value = "upsert")
//    public BaseResponse upsert(@RequestBody UserDto userDto) {
//        userService.update(userDto);
//        return success();
//    }
//
//    @ApiOperation(value = "1.4.2,批量新增、更新用户")
//    @PostMapping(value = "upsertList")
//    public BaseResponse upsertList(@RequestBody List<UserDto> userDtoList) {
//        userService.upsertList(userDtoList);
//        return success();
//    }
//
//    // 查询接口
//
//    @ApiOperation(value = "2.1.1,查询数据")
//    @GetMapping(value = "detail")
//    public BaseResponse detail(@RequestParam String accountName) {
//        return success("success",userService.detail(accountName));
//    }
//
//    @ApiOperation(value = "2.1.2,批量查询数据")
//    @PostMapping(value = "detailList")
//    public BaseResponse detailList(@RequestBody List<String> accountNameList) {
//        return success("success",userService.detailList(accountNameList));
//    }
//
//    @ApiOperation(value = "2.2.1,分页查询")
//    @PostMapping(value = "findByPage")
//    public BaseResponse findByPage(@RequestBody UserDto userDto) {
//        return success("success",userService.findByPage(userDto));
//    }




    //	@ApiOperation(value = "1.2.,批量添加用户(可用状态)")//已完成
//	@PostMapping(value = "insertUserList")
//	public CommonResponse insertUserList(@RequestBody List<User> userList) throws Exception {
//		userList.forEach((user) -> user.setUserCode(RandomUtil.createUUID()));
//		userService.save(userList);
//		return success("批量添加用户成功! ");
//	}
//
//	@ApiOperation(value = "2.1,通过userId查找用户(可用状态)")//已完成
//	@GetMapping(value = "getUserById")
//	public CommonResponse getById(Long userId) {
//		return success(userService.getById(userId));
//	}
//
//	@ApiOperation(value = "2.2,通过userId批量查找用户(可用状态)")//已完成
//	@PostMapping(value = "getUserByIdList")
//	public CommonResponse getByIdList(List<Long> userIdList) {
//		return success(userService.getByIdList(userIdList));
//	}
//
//	@ApiOperation(value = "2.3,通过userCode查找用户(可用状态)")//已完成
//	@GetMapping(value = "getUserByCode")
//	public CommonResponse getUserByCode(String userCode) {
//		return success(userService.getByCode(userCode));
//	}
//
//	@ApiOperation(value = "2.4,通过userCodeList批量查找用户(可用状态)")//已完成
//	@PostMapping(value = "getUserByCodeList")
//	public CommonResponse getUserByCodeList(List<String> userCodeList) {
//		return success(userService.getByCodeList(userCodeList));
//	}
//
//	@ApiOperation(value = "2.5,通过user属性信息批量查找用户(可用状态)")//已完成
//	@PostMapping(value = "getUserByEntityInfo")
//	public CommonResponse getUserByEntityInfo(User user) {
//		return success(userService.getByEntityInfo(user));
//	}
//
//    @ApiOperation(value = "2.6,获取所有用户(可用状态)")//已完成
//    @GetMapping(value = "getAllUser")
//    public BaseResponse getAllUser() {
//        return success("success", userService.listAll());
//    }
//
//	@ApiOperation(value = "2.7,分页查询用户信息(可用状态)")//已完成
//	@PostMapping(value = "getUserByPage")
//	public BaseResponse getUserByPage(UserDto userDto) {
//		Map<String, Object> objectMap = new HashMap<>();
//		return success(userService.page(objectMap, userDto.getPageNo(), userDto.getPageSize()));
//	}

}
