package com.spring.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/3/4.
 */
public class UserApp {
    public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("/bean.xml");
    UserLogin userLogin=context.getBean(UserLogin.class);
    System.out.print(userLogin);
    }
}
