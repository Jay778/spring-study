package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/3/11.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
