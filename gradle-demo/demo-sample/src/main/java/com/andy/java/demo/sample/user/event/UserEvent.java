package com.andy.java.demo.sample.user.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author andy
 */
public class UserEvent extends ApplicationEvent
{
    @Getter @Setter
    private UserEventType eventType;

    public UserEvent(UserEventType eventType, Object source)
    {
        super(source);
        this.eventType = eventType;
    }

}
