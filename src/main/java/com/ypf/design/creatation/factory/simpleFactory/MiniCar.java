package com.ypf.design.creatation.factory.simpleFactory;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:36
 **/
public class MiniCar extends AbstractCar {
    public MiniCar(){
        this.engine ="mini发动机";
    }
    @Override
    public void run() {
        System.out.println(this.engine+"******");
    }
}
