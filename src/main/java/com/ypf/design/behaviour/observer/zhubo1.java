package com.ypf.design.behaviour.observer;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:25
 **/
public class zhubo1 extends Tiktoker{
    void startLive(){

        notifyFans("开始直播");
    }
    @Override
    void addFans(abstractFans fans) {

    }

    @Override
    void notifyFans( String s) {
        for (abstractFans fan:fans   ) {
          fan.acceptMsg(s);
            
        }
    }
}
