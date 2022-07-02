package com.ypf.design.behaviour.state;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:02
 **/
public class sleepState implements personState {

    @Override
    public void doSth() {
        System.out.println("sleep");
    }

    @Override
    public personState next() {
return  new eatState();
    }
}
