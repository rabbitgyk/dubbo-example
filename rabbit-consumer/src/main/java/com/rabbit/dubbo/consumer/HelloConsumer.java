package com.rabbit.dubbo.consumer;

import com.rabbit.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 21/01/2018 6:33 PM
 */
@Service
public class HelloConsumer {

    @Autowired
    private HelloService helloService;

    public String sayHello(String name){
        System.out.println("consumer: say hello " + name);
        return helloService.hello(name);
    }

}
