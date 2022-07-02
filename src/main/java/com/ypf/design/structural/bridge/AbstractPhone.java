package com.ypf.design.structural.bridge;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:50
 **/
public  abstract class AbstractPhone {
    AbstractSale abstractSale;
    public AbstractPhone(AbstractSale abstractSale){
        this.abstractSale = abstractSale;
    }
    public String sold(){
        return "销售方式"+this.abstractSale.saleMethod("线上？？线下");
    }
}
