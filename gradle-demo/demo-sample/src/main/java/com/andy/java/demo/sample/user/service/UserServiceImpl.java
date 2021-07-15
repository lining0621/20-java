package com.andy.java.demo.sample.user.service;

import com.andy.java.demo.sample.user.BusinessException;
import com.andy.java.demo.sample.user.dto.UserCreateDTO;
import com.andy.java.demo.sample.user.event.UserEventPublisher;
import com.andy.java.demo.sample.user.event.UserEventType;
import com.andy.java.demo.sample.user.po.UserEntity;
import com.andy.java.demo.sample.user.po.UserInfoEntity;
import com.andy.java.demo.sample.user.repository.UserInfoRepository;
import com.andy.java.demo.sample.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li-ning
 */
@Service(value = "userService")
@Slf4j
public class UserServiceImpl implements UserService
{
    @Override
    public long save(UserCreateDTO userDTO)
    {
        long userId = -1;
        try
        {
            UserEntity user = new UserEntity();
            BeanUtils.copyProperties(userDTO, user);
            userRepository.save(user);
            log.debug("用户创建成功, {}", user);

            UserInfoEntity userInfo = new UserInfoEntity();
            BeanUtils.copyProperties(userDTO, userInfo);
            BeanUtils.copyProperties(user, userInfo);
            userinfoRepository.save(userInfo);
            log.debug("用户信息提交成功, {}", userInfo);

            userId = user.getUserId();
            userEventPublisher.publishEvent(UserEventType.CREATE_SUCCESS, user);
        }
        catch (Exception e)
        {
            log.error("创建用户失败: {}", e.getMessage());
            throw new BusinessException("异常测试");
        }
        return userId;
    }

    @Override
    public boolean update(UserEntity user)
    {
        try
        {
            userRepository.save(user);
            log.info("数据保存成功, {}", user);
            userEventPublisher.publishEvent(UserEventType.UPDATE_SUCCESS, user);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    @Override
    public void delete(Long userId)
    {
        userRepository.deleteById(userId);
    }

    @Override
    public void findById(Long userId)
    {
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserEntity> findWithPage() {
        return userRepository.findAll();
    }

    @Autowired
    private UserEventPublisher userEventPublisher;
    @Autowired
    private UserRepository     userRepository;
    @Autowired
    private UserInfoRepository userinfoRepository;

}
