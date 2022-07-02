package com.ypf.design.behaviour.state;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:01
 **/
public class eatState implements personState {

    @Override
    public void doSth() {
        System.out.println("eat");
    }

    @Override
    public personState next() {
        return new sleepState();
    }
}
