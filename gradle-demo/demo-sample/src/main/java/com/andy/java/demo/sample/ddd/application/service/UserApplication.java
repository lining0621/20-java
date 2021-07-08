package com.andy.java.demo.sample.ddd.application.service;

import com.andy.java.demo.sample.ddd.domain.service.UserDomain;
import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * @author ccb
 */
@Service("userApplication")
public class UserApplication implements IUserApplication
{
    @Override
    public UserEntity findById(Long id)
    {
        return userDomain.findById(id);
    }
    @Override
    public Page<UserEntity> findUsersWithPage(PageRequest page)
    {
        return userDomain.findUsersWithPage(page);
    }

    @Autowired @Getter @Setter
    private UserDomain userDomain;
}
