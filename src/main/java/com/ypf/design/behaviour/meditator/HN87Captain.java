package com.ypf.design.behaviour.meditator;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:15
 **/
public class HN87Captain extends Captain{
    @Override
    void fly() {
        controlTower.acceptReq();
        System.out.println("起飞");
    }

    @Override
    void land() {
        controlTower.acceptReq();
        System.out.println("落地");
    }
}
