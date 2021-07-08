package com.andy.java.demo.sample.ddd.application.event;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * @author li-ning
 */
@Data
@Slf4j
public class ApplicationRunner implements CommandLineRunner
{
    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void run(String... strings)
    {
        Environment environment = applicationContext.getEnvironment();
        try
        {
            log.info("spring.application.name : {}", environment.getProperty("spring.application.name"));
        }
        catch (Exception e)
        {
            log.warn("Get Properties Exception : {}", e.getMessage());
        }
    }
}
