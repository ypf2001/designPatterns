package com.ypf.design.behaviour.meditator;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:15
 **/
public class JS87Captain extends Captain{
    @Override
    void fly() {
        System.out.println("JS起飞");
    }

    @Override
    void land() {
        System.out.println("JS落地");
    }
}
