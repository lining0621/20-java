package com.andy.java.demo.sample.user.event;

import com.andy.java.demo.sample.user.po.UserEntity;
import com.andy.java.demo.sample.user.po.UserState;
import com.andy.java.demo.sample.user.service.UserService;
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
public class UserEventListener
{
    @EventListener
    public void userEventHandler(UserEvent userEvent)
    {
        log.info("收到用户 {} 事件", userEvent.getEventType());
        UserEntity user = (UserEntity)userEvent.getSource();
        if(log.isDebugEnabled())
        {
            log.debug("事件数据 {}", user.toString());
        }
        switch (userEvent.getEventType())
        {
            case CREATE:
                break;
            case CREATE_SUCCESS:
                user.setState(UserState.NORMAL);
                user.setUpdateDate(LocalDateTime.now());
                userService.update(user);
                break;
            case CREATE_FAILED:
                break;

            default:
                log.warn("不能识{} 事件", userEvent.getEventType());
                break;
        }
        List<UserEntity> tmp = userService.findAll();
        log.info(tmp.toString());
    }

    @Autowired
    private UserService userService;
}
