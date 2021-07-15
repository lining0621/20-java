package com.andy.java.demo.sample.user.api;

import com.andy.demo.commons.base.api.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andy
 */
@Slf4j
@RestController
@RequestMapping("api/user/info/")
@Api(tags = "用户信息管理接口", value = "用户信息管理接口")
public class UserInfoController extends BaseController
{
    @ApiOperation(value = "测试接口", notes = "没有说明")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test()
    {
        return "Hello Word";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create()
    {

    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void delete()
    {

    }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public void findAll()
    {

    }
}
