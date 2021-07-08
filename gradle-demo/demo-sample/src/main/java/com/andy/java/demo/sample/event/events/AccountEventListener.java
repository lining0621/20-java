package com.andy.java.demo.sample.event.events;

import com.andy.java.demo.sample.event.po.EventEntity;
import com.andy.java.demo.sample.event.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author andy
 */
@Slf4j
@Component
public class AccountEventListener
{
    @EventListener
    public void sayHello(AccountEvent accountEvent)
    {
        log.info("收到事件:"+accountEvent.getMsg());
        EventEntity event = new EventEntity();
        event.setName("AA");
        event.setStatus(1);
        event.setArgs("TTT");
        event.setCreateDate(LocalDateTime.now());
        eventService.save(event);
        List<EventEntity> tmp = eventService.findAll();
        log.info(tmp.toString());
    }

    @Autowired
    private EventService eventService;
}
