package com.ypf.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 22:31
 **/
public class Resturant {
    private static Map<String,AbstractWaitness> pool = new HashMap<>();
    void addWaitness(AbstractWaitness waitness,String name){
        pool.put(name, waitness);

    }
    AbstractWaitness getWaitness(String name){
        return pool.get(name);
    }
}
