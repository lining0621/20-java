package com.andy.java.demo.sample.ddd.application.service;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntityOld;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author ccb
 */
public interface IUserApplication
{
    /**
     *
     * @param id
     * @return
     */
    public UserEntityOld findById(Long id);

    /**
     *
     * @param page
     * @return
     */
    public Page<UserEntityOld> findUsersWithPage(PageRequest page);
}
