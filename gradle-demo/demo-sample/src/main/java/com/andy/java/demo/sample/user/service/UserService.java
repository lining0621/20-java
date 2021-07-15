package com.andy.java.demo.sample.user.service;

import com.andy.java.demo.sample.user.dto.UserCreateDTO;
import com.andy.java.demo.sample.user.po.UserEntity;

import java.util.List;

/**
 * @author li-ning
 */
public interface UserService
{
    /**
     *
     * @param user
     * @return
     */
    public long save(UserCreateDTO user);

    public boolean update(UserEntity user);

    public void delete(Long userId);

    public void findById(Long userId);
    /**
     *
     * @return
     */
    public List<UserEntity> findAll();

    /**
     *
     * @return
     */
    public List<UserEntity> findWithPage();
}
