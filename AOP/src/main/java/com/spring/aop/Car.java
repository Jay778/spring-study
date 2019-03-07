package com.spring.aop;

/**
 * Created by 94921 on 2019/3/7.
 */
public class Car implements Move {

    @Override
    public void move() {
        System.out.println("Car is moving....");
    }
}
