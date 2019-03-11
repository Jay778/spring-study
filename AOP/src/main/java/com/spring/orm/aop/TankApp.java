package com.spring.aop;

/**
 * Created by 94921 on 2019/3/7.
 */
public class TankApp {
    public static void main(String[] args) {

        Move t1 = new Tank();
        Move t2 = new Car();
        Move moveProxy = new TankProxy(t1);
        Move moveProxy1=new TankProxy(t2);
        moveProxy.move();
        moveProxy1.move();
    }
}
