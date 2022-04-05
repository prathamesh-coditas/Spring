package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Triangle triangle=(Triangle) applicationContext.getBean("tri");
        System.out.println(triangle);
    }
}
