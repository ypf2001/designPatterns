package com.ypf.design.structural.decorator;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:15
 **/
public class TikTokLive implements live {
    TikTokLive live ;
    @Override
    public void liveOnPhone() {
        System.out.println("开始直播");
    }
    public TikTokLive(TikTokLive live){
        this.live = live;
    }

}
