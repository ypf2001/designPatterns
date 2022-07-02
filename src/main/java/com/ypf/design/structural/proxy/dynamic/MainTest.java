package com.ypf.design.structural.proxy.dynamic;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:46
 **/
public class MainTest {
    public static void main(String[] args) {
         Tiktok proxy = TiktokProxy.getProxy(new MyTiktok());
        proxy.tiktokLive();
    }
}
