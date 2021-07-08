package com.andy.java.demo.sample.ddd.infrastructure.dao.impl;

import com.andy.java.demo.sample.ddd.infrastructure.dao.UserDao;
import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntity;

/**
 * @author ccb
 */
public class UserDaoImpl implements UserDao
{
    @Override
    public void save(UserEntity userEntity) {
        //TODO 数据库操作
    }

    @Override
    public UserEntity query(Long id) {
        //TODO 数据库操作
        return null;
    }
}
