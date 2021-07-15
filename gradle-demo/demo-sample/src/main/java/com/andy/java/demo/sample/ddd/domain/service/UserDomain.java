package com.andy.java.demo.sample.ddd.domain.service;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntityOld;
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
    public UserEntityOld findById(Long id)
    {
        UserEntityOld userEntityOld = userMysqlRepository.findById(id).orElse(null);

        return userEntityOld;
    }

    public Page<UserEntityOld> findUsersWithPage(PageRequest page)
    {
        return userMysqlRepository.findAll(page);
    }

    @Autowired @Getter @Setter
    private UserMysqlRepository userMysqlRepository;
}
