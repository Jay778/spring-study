package com.spring.aop;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 用户定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public  void beforemethod(){
        logger.debug("this is a before method,");
=======
/**
 * Created by 94921 on 2019/3/7.
 */
public class MyBeforeAdvice {
    public  void beforemethod(){
>>>>>>> 4e4808dbfb36f5a59ab2ee60e79d6d253143c39d
        System.out.println("This is a before method");
    }
}
