package com.andy.java.demo.sample.ddd.infrastructure.dao;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntity;

/**
 * @author li-ning
 */
public interface UserDao
{
    /**
     * 保存对象
     * @param userEntity
     */
    void save(UserEntity userEntity);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    UserEntity query(Long id);
}
