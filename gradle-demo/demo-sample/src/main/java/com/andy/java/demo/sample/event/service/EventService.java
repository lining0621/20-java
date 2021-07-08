package com.andy.java.demo.sample.event.service;

import com.andy.java.demo.sample.event.po.EventEntity;

import java.util.List;

/**
 * @author li-ning
 */
public interface EventService
{
    /**
     *
     * @param user
     * @return
     */
    public EventEntity save(EventEntity user);

    /**
     *
     * @return
     */
    public List<EventEntity> findAll();
}
