package com.ypf.design.structural.proxy.dynamic;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:28
 **/
public class MyTiktok implements Tiktok {
    @Override
    public void tiktokLive() {
        System.out.println("hello");
    }
}
