package com.rabbit.dubbo.service.impl;

import com.rabbit.dubbo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 21/01/2018 5:35 PM
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        System.out.println("provider: receive hello " + name);
        return "hello " + name + ", my name is guoyankui!";
    }
}
