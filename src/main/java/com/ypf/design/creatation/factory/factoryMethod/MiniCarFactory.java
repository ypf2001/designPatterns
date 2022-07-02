package com.ypf.design.creatation.factory.factoryMethod;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:49
 **/
public class MiniCarFactory  extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new  MiniCar();
    }
}
