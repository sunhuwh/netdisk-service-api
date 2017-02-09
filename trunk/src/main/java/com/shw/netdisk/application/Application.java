package com.shw.netdisk.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.shw.netdisk.controller", "com.shw.netdisk.serviceImpl", "com.shw.netdisk.entity"})
@EnableMongoRepositories(basePackages={"com.shw.netdisk.dao"})
public class Application{
	
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
    }

}
