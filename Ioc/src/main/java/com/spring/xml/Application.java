package com.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/3/4.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resouce")
        ApplicationContext context=new ClassPathXmlApplicationContext("/bean.xml");
        MessagePrinter printer=context.getBean(MessagePrinter.class);
        printer.printMessage();

    }
}
