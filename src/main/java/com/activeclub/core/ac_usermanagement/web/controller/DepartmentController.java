package com.activeclub.core.ac_usermanagement.web.controller;


import com.activeclub.core.ac_usermanagement.bean.dto.DepartmentDto;
import com.activeclub.core.ac_usermanagement.web.service.DepartmentService;
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
@RequestMapping(value = "/web/department/")
@Api(tags = {"1.用户信息管理"})
public class DepartmentController extends BaseController {

    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "1.1.1,添加")
    @PostMapping(value = "insert")
    public BaseResponse insert(@RequestBody DepartmentDto departmentDto) {
        departmentService.insert(departmentDto);
        return success();
    }

    @ApiOperation(value = "1.1.2,批量添加")
    @PostMapping(value = "insertList")
    public BaseResponse insert(@RequestBody List<DepartmentDto> departmentDtoList) {
        departmentService.insertList(departmentDtoList);
        return success();
    }

    @ApiOperation(value = "1.2.1,删除")
    @GetMapping(value = "delete")
    public BaseResponse delete(@RequestParam String code) {
        departmentService.delete(code);
        return success();
    }

    @ApiOperation(value = "1.2.2,批量删除")
    @PostMapping(value = "deleteList")
    public BaseResponse deleteList(@RequestBody List<String> codeList) {
        departmentService.deleteList(codeList);
        return success();
    }

    @ApiOperation(value = "1.3.1,更新")
    @PostMapping(value = "update")
    public BaseResponse delete(@RequestBody DepartmentDto departmentDto) {
        departmentService.update(departmentDto);
        return success();
    }

    @ApiOperation(value = "1.3.2,批量更新")
    @PostMapping(value = "updateList")
    public BaseResponse updateList(@RequestBody List<DepartmentDto> departmentDtoList) {
        departmentService.updateList(departmentDtoList);
        return success();
    }

    @ApiOperation(value = "1.4.1,新增、更新")
    @PostMapping(value = "upsert")
    public BaseResponse upsert(@RequestBody DepartmentDto departmentDto) {
        departmentService.update(departmentDto);
        return success();
    }

    @ApiOperation(value = "1.4.2,批量新增、更新")
    @PostMapping(value = "upsertList")
    public BaseResponse upsertList(@RequestBody List<DepartmentDto> departmentDtoList) {
        departmentService.upsertList(departmentDtoList);
        return success();
    }

    // 查询接口

    @ApiOperation(value = "2.1.1,查询数据")
    @GetMapping(value = "detail")
    public BaseResponse detail(@RequestParam String code) {
        return success("success",departmentService.detail(code));
    }

    @ApiOperation(value = "2.1.2,批量查询数据")
    @PostMapping(value = "detailList")
    public BaseResponse detailList(@RequestBody List<String> codeList) {
        return success("success",departmentService.detailList(codeList));
    }

    @ApiOperation(value = "2.2.1,分页查询")
    @PostMapping(value = "findByPage")
    public BaseResponse findByPage(@RequestBody DepartmentDto departmentDto) {
        return success("success",departmentService.findByPage(departmentDto));
    }



}
