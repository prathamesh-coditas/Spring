package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean.xml");
        HelloWorld helloWorld=(HelloWorld) context.getBean("hello");
        helloWorld.printHello();
    }
}
