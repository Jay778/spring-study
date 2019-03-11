package com.spring.aop;

/**
 * Created by 94921 on 2019/3/7.
 */
public class TankProxy implements Move {
    public TankProxy(Move t) {
        this.t = t;
    }

    private Move t;
    @Override
    public void move() {
        System.out.println("starting");
        t.move();
        System.out.println("stop");
    }
}
