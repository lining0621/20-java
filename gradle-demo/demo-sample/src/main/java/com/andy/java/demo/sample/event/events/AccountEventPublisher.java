package com.andy.java.demo.sample.event.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author andy
 */
@Component
public class AccountEventPublisher implements ApplicationContextAware
{
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.ctx= applicationContext;
    }

    public void publishEvent(int status, String msg)
    {
        if (status == 0) {
            ctx.publishEvent(new AccountEvent(this, msg));
        } else {
            ctx.publishEvent(new AccountEvent(this,msg)) ;
        }
    }
}