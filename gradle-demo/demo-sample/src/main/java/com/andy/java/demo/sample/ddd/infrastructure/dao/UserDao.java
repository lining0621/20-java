package com.andy.java.demo.sample.ddd.infrastructure.dao;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntityOld;

/**
 * @author li-ning
 */
public interface UserDao
{
    /**
     * 保存对象
     * @param userEntityOld
     */
    void save(UserEntityOld userEntityOld);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    UserEntityOld query(Long id);
}
