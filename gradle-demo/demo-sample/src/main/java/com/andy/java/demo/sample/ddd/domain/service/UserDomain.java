package com.andy.java.demo.sample.ddd.domain.service;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntity;
import com.andy.java.demo.sample.ddd.infrastructure.repository.mysql.UserMysqlRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author ccb
 */
@Service("userDomain")
public class UserDomain
{
    public UserEntity findById(Long id)
    {
        UserEntity userEntity = userMysqlRepository.findById(id).orElse(null);

        return userEntity;
    }

    public Page<UserEntity> findUsersWithPage(PageRequest page)
    {
        return userMysqlRepository.findAll(page);
    }

    @Autowired @Getter @Setter
    private UserMysqlRepository userMysqlRepository;
}
