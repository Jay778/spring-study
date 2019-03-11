package com.spring.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/2/25.
 */
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");
        Student student=(Student)context.getBean("Student");
        System.out.print(student);


    }
}
