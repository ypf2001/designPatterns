package com.ypf.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:57
 **/
public class CglibProxy {
    public static <T> T createProxy(T t) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(t.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib run");
                Object invoke = methodProxy.invoke(o, objects);
                return invoke;
            }
        });
        return t;
    }
}
