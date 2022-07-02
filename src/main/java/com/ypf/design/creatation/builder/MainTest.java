package com.ypf.design.creatation.builder;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:05
 **/
public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();
        builder.customCam("16");
        builder.customCpu("xiaolong");
        builder.customDisk("821g");
        builder.customMem("16");
        System.out.println(builder.getProduct());


    }
}
