package com.activeclub.core.usermanagement.web.controller;


import com.activeclub.core.usermanagement.bean.dto.UserDto;
import com.activeclub.core.usermanagement.web.service.UserService;
import com.activeclub.core.bean.BaseResponse;
import com.activeclub.core.web.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 59456
 * @Date 2020/11/1 23:45
 * @email
 * @Descrip 用户管理接口 crud
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/web/user/")
@Api(tags = {"1.用户信息管理"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "1.1.1,添加用户")
    @PostMapping(value = "insert")
    public BaseResponse insert(@RequestBody UserDto userDto) {
        userService.insert(userDto);
        return success();
    }

    @ApiOperation(value = "1.1.2,批量添加用户")
    @PostMapping(value = "insertList")
    public BaseResponse insertList(@RequestBody List<UserDto> userDtoList) {
        userService.insertList(userDtoList);
        return success();
    }

    @ApiOperation(value = "1.2.1,删除用户")
    @GetMapping(value = "delete")
    public BaseResponse delete(@RequestParam String accountName) {
        userService.delete(accountName);
        return success();
    }

    @ApiOperation(value = "1.2.2,批量删除用户")
    @PostMapping(value = "deleteList")
    public BaseResponse deleteList(@RequestBody List<String> accountNameList) {
        userService.deleteList(accountNameList);
        return success();
    }

    @ApiOperation(value = "1.3.1,更新用户")
    @PostMapping(value = "update")
    public BaseResponse update(@RequestBody UserDto userDto) {
        userService.update(userDto);
        return success();
    }

    @ApiOperation(value = "1.3.2,批量更新用户")
    @PostMapping(value = "updateList")
    public BaseResponse updateList(@RequestBody List<UserDto> userDtoList) {
        userService.updateList(userDtoList);
        return success();
    }

    @ApiOperation(value = "1.4.1,新增、更新用户")
    @PostMapping(value = "upsert")
    public BaseResponse upsert(@RequestBody UserDto userDto) {
        userService.update(userDto);
        return success();
    }

    @ApiOperation(value = "1.4.2,批量新增、更新用户")
    @PostMapping(value = "upsertList")
    public BaseResponse upsertList(@RequestBody List<UserDto> userDtoList) {
        userService.upsertList(userDtoList);
        return success();
    }

    // 查询接口

    @ApiOperation(value = "2.1.1,查询数据")
    @GetMapping(value = "detail")
    public BaseResponse detail(@RequestParam String accountName) {
        return success("success",userService.detail(accountName));
    }

    @ApiOperation(value = "2.1.2,批量查询数据")
    @PostMapping(value = "detailList")
    public BaseResponse detailList(@RequestBody List<String> accountNameList) {
        return success("success",userService.detailList(accountNameList));
    }

    @ApiOperation(value = "2.2.1,分页查询")
    @PostMapping(value = "findByPage")
    public BaseResponse findByPage(@RequestBody UserDto userDto) {
        return success("success",userService.findByPage(userDto));
    }


}
