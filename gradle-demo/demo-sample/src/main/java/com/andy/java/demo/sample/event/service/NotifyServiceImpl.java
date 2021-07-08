package com.andy.java.demo.sample.event.service;

import org.springframework.stereotype.Service;


/**
 * @author li-ning
 */
@Service(value = "notifyService")
public class NotifyServiceImpl implements NotifyService
{
    @Override
    public String notifyTest(String msg)
    {
        System.out.println("AAAA");
        return "";
    }
}
