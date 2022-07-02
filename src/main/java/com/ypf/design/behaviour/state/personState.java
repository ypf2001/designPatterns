package com.ypf.design.behaviour.state;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:08
 **/
public interface personState {
    public void doSth();
    public personState next();
}
