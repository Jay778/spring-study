package com.spring.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/3/4.
 */
public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        Max max = (Max) context.getBean("max");
        System.out.print(max.getMax());
    }
}
