package com.ypf.design.structural.adapter;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:35
 **/
public class MoviePlayer implements Player {
    @Override
    public void play(String str) {
        System.out.println("cn:"+str);
    }
}
