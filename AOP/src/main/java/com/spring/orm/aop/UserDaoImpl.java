package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 94921 on 2019/3/7.
 */
public class UserDaoImpl implements UserDao{

    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void insert(){
        logger.info("开始进入插入操作");
    }
}
