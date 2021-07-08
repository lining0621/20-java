package com.andy.java.demo.sample.event.events;

import org.springframework.context.ApplicationEvent;

/**
 * @author andy
 */
public class NotifyEvent extends ApplicationEvent
{
    private String msg;

    public NotifyEvent(Object source, String msg)
    {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
