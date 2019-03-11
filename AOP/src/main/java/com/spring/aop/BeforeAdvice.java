package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 94921 on 2019/3/7.
 */
public class BeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(BeforeAdvice.class);
    public  void jdbcconnetmethod(){
        logger.info("连接数据库...");

    }
}
