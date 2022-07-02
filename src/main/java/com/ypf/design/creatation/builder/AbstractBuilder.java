package com.ypf.design.creatation.builder;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:01
 **/
public abstract class AbstractBuilder {
    phone phone;
    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);
    phone getProduct(){
        return  phone;
    }
}
