package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/3/7.
 */
public class HelloApp {
    public static void main(String[] args) {
<<<<<<< HEAD
=======


>>>>>>> 4e4808dbfb36f5a59ab2ee60e79d6d253143c39d
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }
}
