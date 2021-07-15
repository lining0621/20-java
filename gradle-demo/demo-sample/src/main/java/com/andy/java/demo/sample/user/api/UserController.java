package com.andy.java.demo.sample.user.api;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.andy.java.demo.sample.user.BusinessException;
import com.andy.java.demo.sample.user.dto.UserCreateDTO;
import org.springframework.http.MediaType;
import com.andy.demo.commons.base.api.BaseController;
import com.andy.java.demo.sample.ddd.infrastructure.common.Result;
import com.andy.java.demo.sample.user.po.UserEntity;
import com.andy.java.demo.sample.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author andy
 */
@Slf4j
@RestController
@RequestMapping("api/user/")
@Api(tags = "用户管理接口", value = "用户管理接口")
public class UserController extends BaseController
{
    @ApiOperation(value = "测试接口", notes = "没有说明")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test()
    {
        return "Hello Word";
    }

    @ApiOperation(value = "创建用户接口", notes = "创建用户接口123")
    @RequestMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Result<Boolean> create(@RequestBody UserCreateDTO user)
    {
        if(log.isDebugEnabled())
        {
            log.debug("收到用户创建请求: {}", user.toString());
        }
        try
        {
            Long userId = userService.save(user);
            return new Result(userId);
        }
        catch (BusinessException e)
        {
            return new Result(e.getMessage());
        }
    }

    @RequestMapping(value = "{userId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long userId)
    {

    }

    @RequestMapping(value = "findAll", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public void findAll(@RequestBody JSONObject data)
    {
        UserEntity user = JSONUtil.toBean(data, UserEntity.class);
        return ;
    }

    @RequestMapping(value = "findWithPage", method = RequestMethod.POST)
    public void findWithPage()
    {

    }

    @Autowired
    private UserService userService;
}
