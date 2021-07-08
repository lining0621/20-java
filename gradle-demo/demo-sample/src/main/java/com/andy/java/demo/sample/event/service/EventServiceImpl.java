package com.andy.java.demo.sample.event.service;

import com.andy.java.demo.sample.event.dao.AccountDao;
import com.andy.java.demo.sample.event.po.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li-ning
 */
@Service(value = "eventService")
public class EventServiceImpl implements EventService
{
    @Override
    public EventEntity save(EventEntity user) {
        return accountDao.save(user);
    }

    @Override
    public List<EventEntity> findAll() {
        return accountDao.findAll();
    }

    private AccountDao accountDao;
    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
