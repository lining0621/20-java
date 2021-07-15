package com.andy.java.demo.sample.event.controller;

import com.andy.demo.commons.base.api.BaseController;
import com.andy.java.demo.sample.event.events.AccountEventPublisher;
import com.andy.java.demo.sample.event.events.NotifyEventPublisher;
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
@RequestMapping("api/event/")
@Api(tags = "事件驱动", value = "事件驱动")
public class EventController extends BaseController
{
    @Autowired
    private NotifyEventPublisher  notifyEventPublisher;
    @Autowired
    private AccountEventPublisher accountEventPublisher;

    @Deprecated
    @ApiOperation(value = "测试接口", notes = "没有说明")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String eventTest()
    {
        notifyEventPublisher.publishEvent(1, "我发布了一个事件");
        accountEventPublisher.publishEvent(2, "account测试");
        return "Hello Word";
    }
}
