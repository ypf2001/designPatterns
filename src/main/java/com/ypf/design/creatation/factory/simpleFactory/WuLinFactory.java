package com.ypf.design.creatation.factory.simpleFactory;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:35
 **/
public class WuLinFactory {
    public AbstractCar newCar(String type) {
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        } else {
            return null;
        }
    }
}
