package com.ypf.design.creatation.factory.factoryMethod;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:56
 **/
public class N95Mask extends AbstractMask{
    public N95Mask(){
        this.price="99";
    }
    @Override
    public void protect() {
        System.out.println("口罩价格"+price);
    }
}
