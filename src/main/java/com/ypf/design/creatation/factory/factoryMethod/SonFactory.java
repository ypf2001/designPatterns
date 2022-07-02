package com.ypf.design.creatation.factory.factoryMethod;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 18:09
 **/
public class SonFactory  extends mainFactory{
    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }

    @Override
    AbstractCar newCar() {
        return new  MiniCar();
    }
}
