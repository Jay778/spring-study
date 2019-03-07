package com.spring.aop;

/**
 * Created by 94921 on 2019/3/7.
 */
public class Tank implements Move {

    @Override
    public void move() {
        System.out.println("Tank is Moving...");
    }
}
