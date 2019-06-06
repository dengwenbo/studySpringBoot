package com.cn.com.cn.study.springboot.controller;

import com.netflix.discovery.DiscoveryClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Example {

    private final Logger logger = Logger.getLogger(getClass());



    @RequestMapping("hello")
    public String helloWorld() {
        return "helloWorld123";
    }
}
