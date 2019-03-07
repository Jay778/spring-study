package com.spring.aop;

/**
 * Created by 94921 on 2019/3/7.
 */
public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello,Spring AOP";
    }
}
