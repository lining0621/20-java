package com.andy.java.demo.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author li-ning
 */
@SpringBootApplication
@EnableAdminServer
public class AdminStart
{
    public static void main(String[] args)
    {
        SpringApplication.run(AdminStart.class, args);
    }
}
