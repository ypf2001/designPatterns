package com.ypf.design.creatation.singleton;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 16:40
 **/
public class Person {
    private String name;
    private String age;
    private static Person instance;
    //饿汉
    private volatile static Person instance1 = new Person();

    //双重锁加内存可见
    public static Person getInstance() {

            if (instance == null) {
                synchronized (Person.class) {
                    if(instance ==null){
                        Person instance = new Person();
                        return instance;
                    }
            }

        }
        return instance;
    }


}
