package com.ypf.design.behaviour.meditator;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:14
 **/
public abstract class Captain {
    public ControlTower controlTower =new ControlTower();
    abstract void fly();
    abstract void land();
}
