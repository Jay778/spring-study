package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by 94921 on 2019/3/11.
 */
public class ImageCopyApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ImageCopy imageCopy=context.getBean(ImageCopy.class);
        try{
            imageCopy.copyImage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
