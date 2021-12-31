package com.activeclub.core.usermanagement.web.controller;


import com.activeclub.core.usermanagement.Application;
import com.activeclub.core.usermanagement.bean.dto.DepartmentDto;
import com.activeclub.core.web.controller.BaseController;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
public class DepartmentControllerTest extends BaseController {

    @Autowired
    private DepartmentController departmentController;

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
        DepartmentDto departmentDto = JSONObject.parseObject(jsonObject, DepartmentDto.class);
        departmentController.insert(departmentDto);
    }


}
