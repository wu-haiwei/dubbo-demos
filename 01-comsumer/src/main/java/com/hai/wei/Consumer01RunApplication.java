package com.hai.wei;

import com.hai.wei.api.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer01RunApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-comsumer.xml");

        IUserService userService = context.getBean("userService", IUserService.class);

        System.out.println(userService.queryById(1));
    }
}
