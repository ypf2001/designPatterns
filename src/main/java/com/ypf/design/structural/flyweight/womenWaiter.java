package com.ypf.design.structural.flyweight;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 22:28
 **/
public class womenWaiter extends AbstractWaitness {
    boolean isFree;
    @Override
    void service() {
        System.out.println("正在服务");
        isFree = false;
    }

    @Override
    void end() {
        System.out.println("服务结束");
        isFree = true;
    }
}
