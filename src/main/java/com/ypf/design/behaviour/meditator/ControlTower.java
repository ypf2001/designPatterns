package com.ypf.design.behaviour.meditator;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:16
 **/
public class ControlTower {
    private boolean  canFly = false;
    public void acceptReq(){
        if(canFly){

            System.out.println("允许");
        }else {
            System.out.println("不允许");
        }
    }
}
