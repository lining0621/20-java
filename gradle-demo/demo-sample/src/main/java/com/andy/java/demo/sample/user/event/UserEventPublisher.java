package com.andy.java.demo.sample.user.event;

import com.andy.java.demo.sample.user.po.UserEntity;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author andy
 */
@Component
public class UserEventPublisher implements ApplicationContextAware
{
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.ctx= applicationContext;
    }

    public void publishEvent(UserEventType eventType, Object source)
    {
        ctx.publishEvent(new UserEvent(eventType, source));
    }
}