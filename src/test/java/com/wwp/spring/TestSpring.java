package com.wwp.spring;

import org.apache.log4j.net.SyslogAppender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwp.test.SpringTest;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext*.xml");
        SpringTest springTest = (SpringTest) ac.getBean("springTest");
        System.out.println(springTest);
        springTest.test();
    }

}
