package com.ypf.design.structural.proxy;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:28
 **/
public class TiktokProxy implements Tiktok{
    private MyTiktok  myTiktok;
    public  TiktokProxy(MyTiktok tiktok){
        this.myTiktok = tiktok;
    }
    @Override
    public void tiktokLive() {

    }
}
