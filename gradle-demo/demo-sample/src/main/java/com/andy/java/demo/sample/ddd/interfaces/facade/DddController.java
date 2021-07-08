package com.andy.java.demo.sample.ddd.interfaces.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lining
 */
@Slf4j
@RestController
@RequestMapping("api/ddd/")
@Api(tags = "领域驱动测试", value = "领域驱动测试")
public class DddController
{
    @ApiOperation(value = "测试接口", notes = "没有说明")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String dddTest()
    {
        return "DDD Test";
    }
}
