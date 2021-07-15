package com.andy.java.demo.sample.event.service;

import com.andy.java.demo.sample.event.dao.AccountDao;
import com.andy.java.demo.sample.event.po.EventEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.List;

/**
 * @author li-ning
 */
@Service(value = "eventService")
@Slf4j
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
//    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
//    public void hanldeOrderCreatedEvent()
//    {
//        log.info("收到事务事件");
//    }onalEventListener(phase = TransactionPhase.AFTER_COMMIT)
//    public void hanldeOrderCreatedEvent()
//    {
//        log.info("收到事务事件");
//    }

    private AccountDao accountDao;
    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
