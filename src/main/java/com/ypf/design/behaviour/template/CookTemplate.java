package com.ypf.design.behaviour.template;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 22:47
 **/
public abstract class CookTemplate {
   void doMethod(){
        method1();
       method2();
       method3();
       method4();
    }
    void method1(){
        System.out.println(11);
    }
    void method2(){
        System.out.println(22);
    }
    void method3(){
        System.out.println(33);
    }
    void method4(){
        System.out.println(44);
    }
    abstract void method5();

}
