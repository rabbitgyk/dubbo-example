package com.rabbit.dubbo.main;

import com.rabbit.dubbo.consumer.HelloConsumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: guoyankui
 * @DATE: 21/01/2018 6:33 PM
 */
public class DubboConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
        context.start();

        HelloConsumer helloConsumer = (HelloConsumer) context.getBean("helloConsumer");
        System.out.println(helloConsumer.sayHello("rabbit"));
    }
}
