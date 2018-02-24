package com.simpleFactory;

/**
 * Created by xuesj on 2018/2/9.
 */
public class Grape implements Fruit {
    @Override
    public void plant() {
        System.out.println("Grape.plant()");
    }

    @Override
    public void grow() {
        System.out.println("Grape.grow()");
    }

    @Override
    public void harvest() {
        System.out.println("Grape.harvest()");
    }
}
