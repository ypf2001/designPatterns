package com.ypf.design.structural.adapter;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:39
 **/
public class Translator {
    public String translate(String str){
        if(str.equals("123")){
            return "一二三";
        }else return "*****";
    }
}
