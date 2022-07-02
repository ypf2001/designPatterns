package com.ypf.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 21:28
 **/
public class TiktokProxy<T> implements InvocationHandler {

    private T target;

        public  TiktokProxy(T t){
        this.target = t;
    }
    public static <T> T getProxy(T t) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new TiktokProxy(t));
        return (T)o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("真正执行被代理");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
