package com.andy.java.demo.sample.event.events;

import com.andy.java.demo.sample.event.service.NotifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author ccb
 */
@Slf4j
@Component
public class NotifyEventListener
{
    @EventListener
    public void sayHello(NotifyEvent notifyEvent)
    {
        log.info("收到事件:"+notifyEvent.getMsg());
        notifyService.notifyTest(notifyEvent.getMsg());
    }

    private NotifyService notifyService;
    @Autowired
    public void setNotifyService(NotifyService notifyService)
    {
        this.notifyService = notifyService;
    }
}
