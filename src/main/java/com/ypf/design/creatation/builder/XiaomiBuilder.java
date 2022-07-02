package com.ypf.design.creatation.builder;

import com.ypf.design.creatation.factory.factoryMethod.AbstractCar;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:03
 **/
public class XiaomiBuilder extends AbstractBuilder {

    public XiaomiBuilder() {
        phone = new phone();
    }
    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.setMem(mem);
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.setCam(cam);
        return this;
    }
}
