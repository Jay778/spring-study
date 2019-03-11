package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 用户定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public  void beforemethod(){
        logger.debug("this is a before method,");
        System.out.println("This is a before method");
    }
}
