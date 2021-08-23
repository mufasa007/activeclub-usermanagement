package com.activeclub.core.ac_usermanagement.web.controller;


import com.activeclub.core.ac_usermanagement.bean.dto.UserDto;
import com.activeclub.core.ac_usermanagement.web.service.UserService;
import com.activeclub.core.bean.BaseException;
import com.activeclub.core.bean.BaseResponse;
import com.activeclub.core.utils.RandomUtil;
import com.activeclub.core.web.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation(value = "1.1,添加用户")//已完成
    @PostMapping(value = "insert")
    public BaseResponse insertUser(@RequestBody UserDto userDto) throws BaseException {
        userService.insert(userDto);
        return success();
    }



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
//	@ApiOperation(value = "2.6,获取所有用户(可用状态)")//已完成
//	@GetMapping(value = "getAllUser")
//	public CommonResponse getAllUser() {
//		return success(userService.listAll());
//	}
//
//	@ApiOperation(value = "2.7,分页查询用户信息(可用状态)")//已完成
//	@PostMapping(value = "getUserByPage")
//	public CommonResponse getUserByPage(UserDto userDto) {
//		Map<String, Object> objectMap = new HashMap<>();
//		return success(userService.page(objectMap, userDto.getPageNo(), userDto.getPageSize()));
//	}

}
