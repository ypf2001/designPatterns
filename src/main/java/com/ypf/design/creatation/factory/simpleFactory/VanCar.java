package com.ypf.design.creatation.factory.simpleFactory;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:36
 **/
public class VanCar  extends AbstractCar {
    public VanCar(){
        this.engine ="柴油机";
    }
    @Override
    public void run() {
        System.out.println(this.engine+"******");
    }
}
