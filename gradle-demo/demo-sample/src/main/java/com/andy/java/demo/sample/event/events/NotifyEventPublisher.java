package com.andy.java.demo.sample.event.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ccb
 */
@Component
public class NotifyEventPublisher implements ApplicationContextAware
{
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.ctx= applicationContext;
    }

    public void publishEvent(int status, String msg)
    {
       switch (status)
       {
           case 0:
               ctx.publishEvent(new NotifyEvent(this, "异常"));
               break;
           default:
               ctx.publishEvent(new NotifyEvent(this,msg)) ;
        }
    }
}