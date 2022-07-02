package com.ypf.design.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 23:23
 **/
public abstract class Tiktoker {
List<abstractFans> fans  = new ArrayList<>();
    abstract void addFans(abstractFans fans);
    abstract void notifyFans(String str);
}
