package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext c= new ClassPathXmlApplicationContext("SingerSpring.xml");
        Singer s=(Singer) c.getBean("s1");
        s.display();
    }
}
