package com.andy.java.demo.sample.ddd.infrastructure.dao.impl;

import com.andy.java.demo.sample.ddd.infrastructure.dao.UserDao;
import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntityOld;

/**
 * @author ccb
 */
public class UserDaoImpl implements UserDao
{
    @Override
    public void save(UserEntityOld userEntityOld) {
        //TODO 数据库操作
    }

    @Override
    public UserEntityOld query(Long id) {
        //TODO 数据库操作
        return null;
    }
}
