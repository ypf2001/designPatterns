package com.ypf.design.structural.proxy.cglib;

import com.ypf.design.structural.proxy.dynamic.MyTiktok;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:59
 **/
public class CglibTest {
    public static void main(String[] args) {
        MyTiktok proxy = CglibProxy.createProxy(new MyTiktok());
        proxy.tiktokLive();
    }
}
