package com.ypf.design.creatation.singleton;

import java.util.Map;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 16:39
 **/

//懒汉//饿汉
public class MainTest {
    public static void main(String[] args) {
        //System.out.println(System.getProperties());
        Map<String, String> getenv = System.getenv();
        getenv.forEach((k,v)->{
            System.out.println(v+k);
        });
    }
}
